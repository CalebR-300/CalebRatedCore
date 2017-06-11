package calebR.calebratedcore.init;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.blocks.BlockOreBasic;
import calebR.calebratedcore.config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block oreZinc;

	
	
	public static void init(){
		if(ModConfig.zincWorldGen==true){
		oreZinc = new BlockOreBasic("oreZinc", "oreZinc");
		}

		
	}
	
	public static void register(){
		if(ModConfig.zincWorldGen==true){
		registerBlock(oreZinc);
		}

	}

	public static void registerRenders(){
		if(ModConfig.zincWorldGen==true){
		registerRender(oreZinc);
		}

	}
	
	public static void registerBlock(Block block){
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
	}
	
	public static void registerRender(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),0,new ModelResourceLocation(new ResourceLocation(CalebRatedCore.modId,block.getUnlocalizedName().substring(5)),"inventory"));
	}
	
}

