//Title: V4 AIO Cooking at Burthope
////____________________________________________________________________________________________
//Choose which food you want to cook
//____________________________________________________________________________________________
int decision_raw_food = 0;
// 0 = Shark
// 1 = Anglerfish
// 2 = Manta ray
// 3 = Sea turtle
// 4 = Dark crab
// 5 = Monkfish
// 6 = Swordfish
// 7 = Lobster
// 8 = Tuna
// 9 = Trout
// 10 = Salmon
// 11 = Herring
// 12 = Sardine
//__________________________________________________________________________________________

// Hinamizawa Variables don't touch!
int npc_bank = 3194;
int npc_id = 6464;
String npc_name = "Emerald Benedict";
int fire_pit = 43475;
WorldPoint triForce = new WorldPoint(3043, 4972, 1); //triForce
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
Widget levelUp = client.getWidget(233,0);
Widget muliSkillMenu = client.getWidget(270,0);
//empty variables
int rawFood;
int cookFood;
String nameFood;
int burnedFood;
int counter;
//D0
int raw_shark = 383;
int cook_shark = raw_shark + 2;
int burn_shark = cook_shark + 2;
int burn_shark_counter = v.getInventory().count(burn_shark);
String shark_name = "Raw Shark";
//D1
int raw_angler = 13441;
int cook_angler = raw_angler - 2;
int burn_angler = raw_angler + 2;
int burn_angler_counter = v.getInventory().count(burn_angler);
String angler_name = "Raw anglerfish";
//D2
int raw_manta = 389;
int cook_manta = raw_manta + 2;
int burn_manta = cook_manta + 2;
int burn_manta_counter = v.getInventory().count(burn_manta);
String manta_name = "Raw manta ray";
//D3
int raw_turtle = 395;
int cook_turtle = raw_turtle + 2;
int burn_turtle = cook_turtle + 2;
int burn_turtle_counter = v.getInventory().count(burn_turtle);
String turtle_name = "Raw sea turtle";
//D4
int raw_dark_crab = 11934;
int cook_dark_crab = raw_dark_crab + 2;
int burn_dark_crab = cook_dark_crab + 2;
int burn_dark_crab_counter = v.getInventory().count(burn_dark_crab);
String crab_name = "Raw dark crab";
//D5
int raw_monk_fish = 7944;
int cook_monk_fish = raw_monk_fish + 2;
int burn_monk_fish = cook_monk_fish + 2;
int burn_monk_fish_counter = v.getInventory().count(burn_monk_fish);
String monk_name = "Raw monkfish";
//D6
int raw_swordfish = 371;
int cook_swordfish = raw_swordfish + 2;
int burn_swordfish = cook_swordfish + 2;
int burn_swordfish_counter = v.getInventory().count(burn_swordfish);
String swordfish_name = "Raw swordfish";
//D7
int raw_lobster = 377;
int cook_lobster = raw_lobster + 2;
int burn_lobster = cook_lobster + 2;
int burn_lobster_counter = v.getInventory().count(burn_lobster);
String lobster_name = "Raw lobster";
//D8
int raw_tuna = 359;
int cook_tuna = raw_tuna + 2;
int burn_tuna = cook_tuna + 2;
int burn_tuna_counter = v.getInventory().count(burn_tuna);
String tuna_name = "Raw tuna";
//D9
int raw_trout = 335;
int cook_trout = raw_trout - 2;
int burn_trout = 343;
int burn_trout_counter = v.getInventory().count(burn_trout);
String trout_name = "Raw trout";
//D10
int raw_salmon = 331;
int cook_salmon = raw_salmon + 2;
int burn_salmon = 343;
int burn_salmon_counter = v.getInventory().count(burn_salmon);
String salmon_name = "Raw salmon";
//D11
int raw_herring = 345;
int cook_herring = raw_herring + 2;
int burn_herring = 343;
int burn_herring_counter = v.getInventory().count(burn_herring);
String herring_name = "Raw herring";
//D10
int raw_sardine = 327;
int cook_sardine = raw_sardine - 2;
int burn_sardine = 343;
int burn_sardine_counter = v.getInventory().count(burn_sardine);
String sardine_name = "Raw sardine";

private void setFoodType() {
    if (decision_raw_food == 0) {
        rawFood = raw_shark;
        cookFood = cook_shark;
        nameFood = shark_name;
        burnedFood = burn_shark;
        counter = v.getInventory().count(burn_shark);
    }
    else if (decision_raw_food == 1) {
        rawFood = raw_angler;
        cookFood = cook_angler;
        nameFood = angler_name;
        burnedFood = burn_angler;
        counter = v.getInventory().count(burn_angler);
    }
    else if (decision_raw_food == 2) {
        rawFood = raw_manta;
        cookFood = cook_manta;
        nameFood = manta_name;
        burnedFood = burn_manta;
        counter = v.getInventory().count(burn_manta);
    }
    else if (decision_raw_food == 3) {
        rawFood = raw_turtle;
        cookFood = cook_turtle;
        nameFood = turtle_name;
        burnedFood = burn_turtle;
        counter = v.getInventory().count(burn_turtle);
    }
    else if (decision_raw_food == 4) {
        rawFood = raw_dark_crab;
        cookFood = cook_dark_crab;
        nameFood = crab_name;
        burnedFood = burn_dark_crab;
        counter = v.getInventory().count(burn_dark_crab);
    }
    else if (decision_raw_food == 5) {
        rawFood = raw_monk_fish;
        cookFood = cook_monk_fish;
        nameFood = monk_name;
        burnedFood = burn_monk_fish;
        counter = v.getInventory().count(burn_monk_fish);
    }
    else if (decision_raw_food == 6) {
        rawFood = raw_swordfish;
        cookFood = cook_swordfish;
        nameFood = swordfish_name;
        burnedFood = burn_swordfish;
        counter = v.getInventory().count(burn_swordfish);
    }
    else if (decision_raw_food == 7) {
        rawFood = raw_lobster;
        cookFood = cook_lobster;
        nameFood = lobster_name;
        burnedFood = burn_lobster;
        counter = v.getInventory().count(burn_lobster);
    }
    else if (decision_raw_food == 8) {
        rawFood = raw_tuna;
        cookFood = cook_tuna;
        nameFood = tuna_name;
        burnedFood = burn_tuna;
        counter = v.getInventory().count(burn_tuna);
    }
    else if (decision_raw_food == 9) {
        rawFood = raw_trout;
        cookFood = cook_trout;
        nameFood = trout_name;
        burnedFood = burn_trout;
        counter = v.getInventory().count(burn_trout);
    }
    else if (decision_raw_food == 10) {
        rawFood = raw_salmon;
        cookFood = cook_salmon;
        nameFood = salmon_name;
        burnedFood = burn_salmon;
        counter = v.getInventory().count(burn_salmon);
    }
    else if (decision_raw_food == 11) {
        rawFood = raw_herring;
        cookFood = cook_herring;
        nameFood = herring_name;
        burnedFood = burn_herring;
        counter = v.getInventory().count(burn_herring);
    }
    else if (decision_raw_food == 12) {
        rawFood = raw_sardine;
        cookFood = cook_sardine;
        nameFood = sardine_name;
        burnedFood = burn_sardine;
        counter = v.getInventory().count(burn_sardine);
    }
}

private void bankingMethod(){
    setFoodType();
    counter = v.getInventory().count(burnedFood);

    if (v.getLocalPlayer().hasAnimation(-1) && (v.getInventory().amountInInventory(cookFood, 28  - counter, 28) || !v.getInventory().inventoryFull())) {
        v.invoke("Bank","<col=ffff00>"+ npc_name +"",npc_id,11,0,0,false);
    
        v.getCallbacks().afterTicks(1, () -> {
                            // v.invoke("Default Quantity: <col=ff9040>All</col>","",1,57,-1,12582931,false);
                            if (v.getInventory().amountInInventory(cookFood, 28  - counter, 28)){
                            v.getBank().depositAll();
                            }
                            else if (!v.getInventory().inventoryFull())
                            {
                            v.getBank().depositAll();

                            }
                            v.getCallbacks().afterTicks(3, () -> {
                            v.getBank().withdraw(rawFood, 28);
                                });
                            
                        });
                        v.invoke("Close","",1,57,11,12582913,false);
    }
    }

private void cookingMania(){
   setFoodType();
   if(levelUp != null) {
   log.info("LEVEL UP");
   v.invoke("Bank", "<col=ffff00>" + npc_name + "", npc_id, 11, 0, 0, false);
      v.getCallbacks().afterTicks(2, () -> {
                           v.getBank().depositAll();
                               });
   

}
    if (currentLocation.equals(triForce) && v.getInventory().amountInInventory(rawFood, 28, 28))
    {
    	  GameObject firePit = v.getGameObject().findNearest(fire_pit);
    	  if (firePit != null) {
                int firePitSceneX = firePit.getSceneMinLocation().getX();
                int firePitSceneY = firePit.getSceneMinLocation().getY();
        v.invoke("Cook","<col=ffff>Fire",fire_pit,3,firePitSceneX,firePitSceneY,false);
           v.getCallbacks().afterTicks(2, () -> {
                            v.invoke("Cook","<col=ff9040>"+nameFood+"</col>",1,57,-1,17694734,false);
                                });
    }
    }
    else {
        bankingMethod();
    }
}
private void runScript(){
    if (!currentLocation.equals(triForce))
    {
        v.getWalking().walk(triForce);
    }
    else if (currentLocation.equals(triForce))
    {
    cookingMania();
    }
}
runScript();