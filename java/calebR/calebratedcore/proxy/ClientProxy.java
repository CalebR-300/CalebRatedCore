package calebR.calebratedcore.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.config.ModConfig;
import calebR.calebratedcore.init.ModArmour;
import calebR.calebratedcore.init.ModBlocks;
import calebR.calebratedcore.init.ModItems;
import calebR.calebratedcore.init.ModTools;

public class ClientProxy extends CommonProxy {
	
@Override
	public void preInit(){
	//Pre-initializes config file
	ModConfig.clientPreInit();
}

	//Client handlers textures (renders), so they are registered here.
@Override
	public void registerRenders(){
	ModItems.registerRenders();
//Tin Ore disabled
	ModBlocks.registerRenders();
	ModTools.registerRenders();
	ModArmour.registerRenders();
	
}
}