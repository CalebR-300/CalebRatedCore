Welcome to CalebRatedCore!

CalebRatedCore is my Minecraft Mod in progress, which is intended to be a modpack core in the future.
None of the items have recipes, they will be added in later using Minetweaker.
Built for 1.10.2 at the moment, as some important mods have yet to make the switch to 1.11.2.

By itself, this mod still has a few interesting features:
- Silk Touch is mostly useless. Most (not all) vanilla blocks are obtainable by hand/with standard tool.
- Stone will drop itself, rather than cobblestone.
- Bookshelves, Glass/Glass Panes and Ender Chests will all drop themselves. Glass and Bookshelves can be broken by hand.
- Logs can't be punched. You need an axe. -_-
- Leaves have a high chance of dropping sticks.
- Apples no longer drop from oak leaves.
- Obsidian has been nerfed big time. Only requires iron pickaxe, and blast resistance equivalent to stone.
- Clippers - Similar to shears, but sheep drop uncoloured fleece, rather than wool. Intended as shears replacement.
- Bronze/Steel Saws and Work Tools. Intended to fill the gaps in PrimalCore (which will be part of the modpack). Note that my Work Tools are incapable of in-world recipes at the moment.
- Zinc Ore Generation (Configurable) - Note that there are no zinc ingots/nuggets/etc included. Recommended you disable it if you don't have any mods that need/use zinc.

Not so interesting things:
- Bronze Tools/Armour - May be removed, as IC2 already has these. Only added them as a test.
- Planks, Bricks, Fleece, and random components - Useless by themselves. Intended as parts for other blocks. Work continues.

If you find any bugs, just raise an issue. Details are important.

Keep in mind that recipes, more configs, wikis, and updating to 1.11.2 (or even 1.12) are on the back burner whilst I focus on constructing the mod pack recipe base. I'm intending on changing pretty much everything, so it will take a while (assuming I do finish).

So yeah, this mod isn't that great as of now, but if you want to download it, the links are below.


Downloads:
Current File: http://www.mediafire.com/file/lcxa09fuo4fo5fs/calebratedcore-1.1.4.jar

Open Source for Modders: http://www.mediafire.com/file/81fsmsf2amsc6ys/calebratedcore-1.1.4-sources.jar


Notes About the Modpack
Assuming I ever get it done, the modpack is intended to have progression from several eras, with tools and machines made available as you advance: 
-Stone, Bronze and Iron Age will rely on PrimalCore and Better Beginnings for progression. 
-Medieval era will provide access to most non-machine mods. 
-Industrial Era will begin and End with Immersive Engineering. More complex appliances, tools and weaponry will become available as you build IE machines. 
-Digital era will become available when you have most IE machines constructed, IC2 will take over for compact/futuristic machinery. Pretty much the icing on the cake.

I'm not personally a fan of magic, so I won't have magic mods, and I'm probably going to prevent enchanting in favour of smithing (planning on most tools having Fortune from the get go). I'll also allow players access to quartz and glowstone without needing nether access.

Another important aspect is attempting to prevent blocks containing more than a blocks worth of materials (minus consumable parts). That is, a chest won't require 8 planks, only 4 boards and some wooden/metal pins as hinges (equivalent to one plank). Another key change is that 8 nuggets will equal 1 ingot, and 8 ingots equal one block. This will make things easily divisable.
Unfortunately, this will mean that nearly every recipe will need to change.

I'm still undecided whether to make crafting recipes more complex, or simplifying them as much as possible. At the moment I'm leaning complex with the Better Beginnings advanced crafting table being used for most crafting.



Changelog

1.1.4 	- Fixed a bug - breaking a log would sometimes drop a bookshelf. Will keep events separated in future.
		- Fixed sapling drops when using clippers on leaves.
		- After much difficulty, apples no longer drop from oak trees.
		- Simplified bookshelf code. No player/tool checks. Simply break and collect.
		- Glass, glass panes (and variants) all drop themselves. Silk Touch pretty much useless now. >:D
		- Obsidian is now a lot weaker and only needs an iron pickaxe. Obsidian furniture can now be collected with stone pickaxes.
		- Removed my Iron Tools (except clippers), as I've discovered a mod - Material Changer - that allows me to edit vanilla/modded tool durability.

1.1.3.3	- Added Quartz Clippers (to replace PrimalCore equivalent).
		- All applicable items/blocks are added to the Ore Dictionary.

1.1.3.2 - Fixed stone brick texture bug (note to self: case sensitivity is important - remember your CAPS people).
		- Added a few zinc/brass related items.

1.1.3.1 - IMPORTANT - Delete your configs! I've made changes to the config file.
		- Replaced tin ore with zinc. (Since my modpack already has tin, but no zinc).
		- Noticed stone bricks aren't displaying textures in my modpack, even though they work in my test environment. -_-

1.1.3	- Added custom tools, based on PrimalCore tools (to fill the gaps in the mod, namely Bronze and Steel).
		- Important: My tools aren't capable of PrimalCore's in-world recipes. PrimalCore's code isn't open source yet.
		- The tools and items are pretty much done now.
		- Re-added tin ore. Fixed typo in code ('pickaxe' instead of 'pick'), and works properly with other mods.

1.1.2	- Added even more items. Should be pretty much all I need now.
		- Added wrought iron tools (since I couldn't figure out how to change vanilla iron tool durability).
		- Wrought iron tools are the same as vanilla tools, but more durable.
		- No wrought iron armour ATM, may consider it if I need it.
		- Fixed glitch in axes not having correct harvest level (bug created after prior axe fix).

1.1.1.2 - Fixed clippers durability (instead of extending ItemShears, I extended ItemTool).
		- Clippers now act as weapons, albeit not very powerful. (Slower than sword, stronger than bare fists).
		- Fixed bronze axe not doing enough damage - code is now correct.
		- Noticed a new bug. Using clippers on leaves will still drop saplings, meaning infinite saplings from a leaf block.
		- Attempted to patch above bug, but no luck. Realised that player would have to waste the clippers durability trying to use this exploit, so not so bad.
		- Fortunately I was able to prevent stick drops when using clippers. So no infinite stick exploit.

1.1.1.1 - Reinstated tools and armour. Tin Ore is still disabled (see below).
		- Noticed my Tin Ore doesn't seem to work properly with Better Beginnings or Fortune Ores - must be glitch in my code.
		- Renamed Shears 'Clippers', and added Flint, Iron and Steel Variants. All will make sheep drop fleece.
		- Noticed a bug - clippers all have the same durability... I'll have to amend this.

1.1.1	- Added a heap of items for the modpack. More to come.

1.1.0.2 - After making some changes to my modpack, almost everything I made in this mod is redundant. -_-
		- Therefore, nearly everything has been disabled. Code has been kept as comments for reference.
		- Basically, only the stone/wood events, and a small number of items remain enabled.
		- Configs do nothing ATM. May restructure configs later and disable things properly.

1.1.0.1 - Added tin to ore dictionary. Disabled by default.
		- Behind the scenes - added a heap of new textures. Not all will be used.

1.1.0  - Added bronze armour.

1.0.9.3 - Finally! Bookshelf drop works correctly. Simply had to rearrange the order of the if statements. *facepalm*

1.0.9.2 - Tweaked bookshelf drop - mod axes should work, but now breaking bookshelf with TNT crashes game.

1.0.9.1 - Made bookshelves drop themselves, provided you use an axe. Code unoptimised - won't work on other mods' axes.

1.0.9 	- Added a config file, so now tin ore generation can be configured.
		- Tweaked tin spawning, now a shallow ore (near surface), thus a bit easier to find

1.0.8.3 - Renamed mod to CalebRatedCore, 'tutorial' was starting to get a bit old.

1.0.8.2 - Fixed stone drop bug. Method should be extendable now.
		- Updated sheep shear code, should only affect entities explicitly dropping wool. Code now correctly formatted. (Cheers Choonster)

1.0.8.1 - Fixed sheep shear bug, shouldn't cause conflicts, unless modded entity drops anything with 'Wool' in the name.
		- Reinstated sheep drop code (for killing sheep); albeit with minor modifications.

1.0.8 	- Altered sheep shear drops. However, code may cause conflict with other mods.

1.0.7.1 - Realised stone drop code was bugged (as in causing crashes bugged), and had to remove it. :(

1.0.7 	- Added custom shears - Bronze Shears. (Thanks Bright_Spark for tip)
		- Tin Oregen currently forced disabled - will re-enable once I have a config file for the mod.
		- Behind the scenes, I've been organising exactly what items/blocks I need for modpack. Work continues.

1.0.6 	- After much effort, added an event to change Vanilla Stone Block to drop itself.
		- Added code to force players to use tools when cutting wooden blocks (Based on Choonster's Test3 mod)
		- Above tweak also adds a chance for sticks to drop from leaves.

1.0.5 	- Added a bunch of standard Bronze tools - Sword, Pickaxe, Axe, Shovel and Hoe.

1.0.4 	- Set up Ore Generation for Tin. Works like a treat.

1.0.3 	- Replaced Manganese with Tin, made Tin Ore Block drop tin.
		- Made a new Item - Interface Screen (doesn't do anything, but will be a component in other things later on).

1.0.2 	- Added Manganese Ore as a block.
		- Played around with mob drops, trying to alter sheep drops, but realised shearing handled differently. Gave up.

1.0.1 	- Added Manganese Item as a test item.

1.0.0 	- Start up, just getting mod environment sorted. Which is an ordeal in itself.
