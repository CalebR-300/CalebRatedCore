package calebR.calebratedcore.proxy;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.config.ModConfig;
import calebR.calebratedcore.init.ModItems;
import calebR.calebratedcore.worldgen.OreGen;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit() {
		//Pre-initializes config file
		ModConfig.preInit();
		
	}
	
	public void init(){
if(ModConfig.zincWorldGen==true){
	GameRegistry.registerWorldGenerator(new OreGen(), 0);	
}
	}
	
	public void registerRenders(){
	 
	}
 
	public void registerModelBakeryStuff(){
		//Generated meta items/blocks, need a line for each meta item or block
	ModelBakery.registerItemVariants(ModItems.itemBoardWood, new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodOak"),new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodSpruce"),new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodBirch"),new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodJungle"),new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodAcacia"),new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodDarkoak"),new ResourceLocation(CalebRatedCore.modId,"itemBoardWoodTreated"));
	ModelBakery.registerItemVariants(ModItems.itemBrick, new ResourceLocation(CalebRatedCore.modId,"itemBrickStone"),new ResourceLocation(CalebRatedCore.modId,"itemBrickAndesite"),new ResourceLocation(CalebRatedCore.modId,"itemBrickBasalt"),new ResourceLocation(CalebRatedCore.modId,"itemBrickDiorite"),new ResourceLocation(CalebRatedCore.modId,"itemBrickDolomite"),new ResourceLocation(CalebRatedCore.modId,"itemBrickGneiss"),new ResourceLocation(CalebRatedCore.modId,"itemBrickGranite"),new ResourceLocation(CalebRatedCore.modId,"itemBrickLimestone"),new ResourceLocation(CalebRatedCore.modId,"itemBrickMarble"),new ResourceLocation(CalebRatedCore.modId,"itemBrickRedsandstone"),new ResourceLocation(CalebRatedCore.modId,"itemBrickSandstone"),new ResourceLocation(CalebRatedCore.modId,"itemBrickAmphibolite"),new ResourceLocation(CalebRatedCore.modId,"itemBrickEndstone"));
	
	}


	
}