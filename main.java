//______________________________________________________________________________________________
//Title: V4 Angler Fishing Script
////____________________________________________________________________________________________

//Hinamizawa's Variables Down Below: 
String username = "";
String password = "";
int lvl = client.getBoostedSkillLevel(Skill.FISHING);
int sand_worm_id = 13431;
int barrel_fish_id = 25584;  // ID of the fish barrel
int closed_barrel_fish_id = 25582; // its closed
int closed_barrel_fish_slot_id = v.getInventory().slot(25582);
boolean can_spec = v.getEquipment().hasEquipped(21028);
WorldPoint wp1 = new WorldPoint(1820, 3777, 0);
WorldPoint wp1_1 = new WorldPoint(1819, 3775, 0);
WorldPoint wp1_2 = new WorldPoint(1818, 3779, 0);
WorldPoint[] points = {wp1, wp1_1, wp1_2};
WorldPoint selectedPoint = points[new Random().nextInt(points.length)];
WorldPoint wp2 = new WorldPoint(1806, 3786, 0);
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
NPC fishingSpot = v.getNpc().findNearest(6825);


//Methods Down Below
private void logIn(){
    v.getGame().login(username, password, client.getWorld());
    v.getCallbacks().afterTicks(20, () -> {
        v.invoke("Play","",1,57,-1,24772680,false);
    });
}

private void useSpecialAttack() {
    if (v.getCombat().specRemaining(100, 100)) {
        v.getCombat().spec(1);
    }
}

private void enableRunning() {
    if (client.getEnergy() >= 2000) {
        v.getWalking().turnRunningOn();
    }
}

private void baitSpot() {
    if (!v.getInventory().inventoryFull() && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
        v.getFishing().bait(fishingSpot);
    }
}

private void openFishBarrel() {
    if (v.getInventory().hasIn(closed_barrel_fish_id)) {
        v.invoke("Open","<col=ff9040>Fish barrel</col>",4,57,closed_barrel_fish_slot_id,9764864,false);
    }
}
private void moveAndDepositItems() {
    currentLocation = client.getLocalPlayer().getWorldLocation();
    
    if ((!v.getWalking().isMoving() || !v.getWalking().isRunning()) 
        && (!currentLocation.equals(wp1) && !currentLocation.equals(wp1_1) && !currentLocation.equals(wp1_2)) 
        && !currentLocation.equals(wp2) 
        && v.getLocalPlayer().hasAnimation(-1) 
        && v.getInventory().inventoryFull()) {
//        v.getCallbacks().afterTicks(15, () -> {
        WorldPoint selectedPoint = points[new Random().nextInt(points.length)];
        v.getWalking().walk(selectedPoint);
//        });
        }
        
    else if ((currentLocation.equals(wp1) || currentLocation.equals(wp1_1) || currentLocation.equals(wp1_2)) 
               && v.getInventory().inventoryFull() 
               && v.getLocalPlayer().hasAnimation(-1) 
               && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
        
        v.getWalking().walk(wp2);
        
    } else if (!v.getWalking().isMoving() 
               && v.getLocalPlayer().hasAnimation(-1) 
               && currentLocation.equals(wp2) 
               && v.getInventory().inventoryFull()) {
        
        GameObject bankChest = v.getGameObject().findNearest(10529);
        if (bankChest != null) {
            int bankChestSceneX = bankChest.getSceneMinLocation().getX();
            int bankChestSceneY = bankChest.getSceneMinLocation().getY();

            v.invoke("Deposit","<col=ffff>Bank Deposit Box",10529,3,bankChestSceneX,bankChestSceneY,false);
            v.getCallbacks().afterTicks(3, () -> {
                v.invoke("Default Quantity: <col=ff9040>All</col>","",1,57,-1,12582931,false);
                if (v.getInventory().hasIn(barrel_fish_id)) {
                    v.invoke("Empty","<col=ff9040>Open fish barrel</col>",9,1007,0,12582914,false);
                }
                v.invoke("Deposit-All","<col=ff9040>Raw anglerfish</col>",1,57,13,12582914,false);
                v.invoke("Close","",1,57,11,12582913,false);
            });
        }
    }
}

private void walkToFish() {
    if ((!v.getWalking().isMoving() || !v.getWalking().isRunning()) && !v.getInventory().inventoryFull() && currentLocation.equals(wp2) && v.getLocalPlayer().hasAnimation(-1)) {
        WorldPoint selectedPoint = points[new Random().nextInt(points.length)];
//         v.getCallbacks().afterTicks(10, () -> {
        v.getWalking().walk(selectedPoint);
//         });
    }
}

private void runScript() {
    if(!client.getGameState().equals(GameState.LOGGED_IN)) {
        logIn();
    } else {
        if (can_spec) {
            useSpecialAttack();
        }
        enableRunning();
        openFishBarrel();
        if (v.getInventory().inventoryFull() && !v.getWalking().isMoving()) {
        moveAndDepositItems();
        }
       else if (!v.getInventory().inventoryFull() && !v.getWalking().isMoving()) {
        	
        walkToFish();
        }
        baitSpot();
    }
}

runScript();