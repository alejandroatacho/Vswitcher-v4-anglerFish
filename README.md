```md
# V4 Angler Fishing

## Guide
1. Copy the provided Java code into your code editor.
2. Save the file with an appropriate name.
3. Make sure if you're using a fish barrel, it's in the first inventory slot of your inventory.
4. Wear a Dragon Harpoon.
5. Wear a Lightbearer Ring (optional, but recommended).
6. Get your Fishing Rod and Sandworm.

### Usage
1. Start the script in front of the Angler fishing spots (not the bank unless you stand at a specific spot in front of the deposit box).
2. Ensure you have the necessary items and equipment equipped for fishing.
3. The script will perform the following actions:

   - Use special attack if enough special energy is available.
   - Enable running if the player's energy is full.
   - Bait the fishing spot if the inventory is not full and the player is not moving.
   - Open the fish barrel if it is in the inventory and it is detected as closed.
   - Move and deposit items in the bank if the inventory is full and the player is not moving.
   - Empty your fish barrel if it is detected.
   - Walk to the fishing spot if the inventory is not full and the player is at the fish deposit location (aka in front of the deposit box).

---

**Note**: The script will auto detect if you have a fish barrel, so don't worry about that! However, make sure it's in your 1st inventory slot due to the deposit box item slot area coordination on the screen. The main reason we are using the deposit box here is because we don't want to deal with a bank pin; this way, it's easier for you to use.

Please ensure that you understand the code and its implications before implementing it in Vswitcher.
```

```md
# Update Log - Angler Fishing Script

## Version 1.1 - 6/27/2023
- Can now detect if you have dragon harpoon and then spec, for skillers so you don't have to disable the code
- Implemented randomization human movement from fishing spot to deposit bank and opposite.
- Added && Enhanced the login process for more reliable script execution, so you can fish longer incase you dc or something happens.

## Version 1.0 - — 06/17/2023
- First Release
- Added support for using special attack if available.
- Improved energy management by enabling running when energy is above a certain threshold.
- Optimized fishing logic by checking for animation and inventory space before baiting the fishing spot.
- Implemented the ability to open the fish barrel if closed and deposit fish if the inventory is full.

```
