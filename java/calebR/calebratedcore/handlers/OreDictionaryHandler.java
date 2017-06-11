package calebR.calebratedcore.handlers;

import calebR.calebratedcore.config.ModConfig;
import calebR.calebratedcore.init.ModBlocks;
import calebR.calebratedcore.init.ModItems;
import calebR.calebratedcore.init.ModTools;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary(){
		//Only adds tin to ore dictionary if included in game
		if(ModConfig.zincWorldGen==true){
		OreDictionary.registerOre("oreZinc", ModBlocks.oreZinc);
		}
		//Attempt to integrate all items wherever possible
		OreDictionary.registerOre("gearWood", ModItems.itemGearWood);
		OreDictionary.registerOre("dustDirt", ModItems.itemDustDirt);
		
		OreDictionary.registerOre("toolMallet", ModTools.itemBronzeHammer);
		OreDictionary.registerOre("toolMallet", ModTools.itemSteelHammer);
		
		OreDictionary.registerOre("toolWorkBlade", ModTools.itemBronzeWorktool);
		OreDictionary.registerOre("toolWorkBlade", ModTools.itemSteelWorktool);
		OreDictionary.registerOre("itemKnife", ModTools.itemBronzeWorktool);
		OreDictionary.registerOre("itemKnife", ModTools.itemSteelWorktool);
		OreDictionary.registerOre("craftingToolKnife", ModTools.itemBronzeWorktool);
		OreDictionary.registerOre("craftingToolKnife", ModTools.itemSteelWorktool);
		
		OreDictionary.registerOre("toolShears", ModTools.itemFlintClippers);
		OreDictionary.registerOre("toolClippers", ModTools.itemFlintClippers);
		OreDictionary.registerOre("toolShears", ModTools.itemQuartzClippers);
		OreDictionary.registerOre("toolClippers", ModTools.itemQuartzClippers);
		OreDictionary.registerOre("toolShears", ModTools.itemBronzeClippers);
		OreDictionary.registerOre("toolClippers", ModTools.itemBronzeClippers);
		OreDictionary.registerOre("toolShears", ModTools.itemIronClippers);
		OreDictionary.registerOre("toolClippers", ModTools.itemIronClippers);
		OreDictionary.registerOre("toolShears", ModTools.itemSteelClippers);
		OreDictionary.registerOre("toolClippers", ModTools.itemSteelClippers);
		
		OreDictionary.registerOre("crushedBauxite", ModItems.itemCrushedBauxite);
		OreDictionary.registerOre("crushedNickel", ModItems.itemCrushedNickel);
		OreDictionary.registerOre("crushedZinc", ModItems.itemCrushedZinc);
		
		OreDictionary.registerOre("crushedPurifiedBauxite", ModItems.itemPurifiedBauxite);
		OreDictionary.registerOre("crushedPurifiedNickel", ModItems.itemPurifiedNickel);
		OreDictionary.registerOre("crushedPurifiedZinc", ModItems.itemPurifiedZinc);
		
		OreDictionary.registerOre("dustTinyBauxite", ModItems.itemDustTinyBauxite);
		OreDictionary.registerOre("dustTinyNickel", ModItems.itemDustTinyNickel);
		OreDictionary.registerOre("dustTinyZinc", ModItems.itemDustTinyZinc);
		OreDictionary.registerOre("dustTinyGlowstone", ModItems.itemDustTinyGlowstone);
		OreDictionary.registerOre("dustTinyRedstone", ModItems.itemDustTinyRedstone);
		OreDictionary.registerOre("dustTinyGunpowder", ModItems.itemDustTinyGunpowder);
		
		OreDictionary.registerOre("wireRedmetal", ModItems.itemWireRedmetal);
		
		OreDictionary.registerOre("dustGlass", ModItems.itemDustGlass);
		
		OreDictionary.registerOre("miniCokeCoal", ModItems.itemNuggetCokeCoal);
		OreDictionary.registerOre("nuggetCokeCoal", ModItems.itemNuggetCokeCoal);
		
		OreDictionary.registerOre("toolSawMetal", ModTools.itemBronzeSaw);
		OreDictionary.registerOre("toolSawMetal", ModTools.itemSteelSaw);
		
		OreDictionary.registerOre("nuggetClay", ModItems.itemTinyClay);
		
		OreDictionary.registerOre("nuggetPlastic", ModItems.itemNuggetPlastic);
		
		OreDictionary.registerOre("nuggetGlass", ModItems.itemTinyGlass);
		
		OreDictionary.registerOre("nuggetSilicon", ModItems.itemTinySilicon);
		
		OreDictionary.registerOre("nuggetQuartz", ModItems.itemTinyQuartz);
		
		OreDictionary.registerOre("stickSilver", ModItems.itemRodSilver);
		
		OreDictionary.registerOre("stickBrass", ModItems.itemRodBrass);
		
		OreDictionary.registerOre("stickBronze", ModItems.itemRodBronze);
		
		OreDictionary.registerOre("stickInvar", ModItems.itemRodInvar);
		
		OreDictionary.registerOre("dustWood", ModItems.itemWoodPulp);
		
		OreDictionary.registerOre("plateSilicon", ModItems.itemPlateSilicon);
		
		OreDictionary.registerOre("plateSlate", ModItems.itemPlateSlate);
		
		OreDictionary.registerOre("ingotPlastic", ModItems.itemIngotPlastic);
		
		OreDictionary.registerOre("dustInvar", ModItems.itemGritInvar);
		
		OreDictionary.registerOre("dustSand", ModItems.itemDustSand);
		
		OreDictionary.registerOre("nuggetRedmetal", ModItems.itemNuggetRedmetal);
		
		OreDictionary.registerOre("fabricPlastic", ModItems.itemPlasticWeave);
		
		
					
	}

}
