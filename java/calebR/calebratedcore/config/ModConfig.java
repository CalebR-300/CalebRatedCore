package calebR.calebratedcore.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//This class generates a config file, which you can use to alter which elements of your mod load into the game.

public class ModConfig {

	private static Configuration config = null;
	
	
	//Need a new category name for every group of config entries (not for every entry)
	public static final String CATEGORY_NAME_BLOCKS = "blocks";
	
	
	//Add this line for every entry of the config, important that data value matches config (i.e boolean, int, etc).
	//Make sure that the name of the module is different to the property (i.e. zincWorldGen for propertyTinWorldGen).
	public static boolean zincWorldGen;
	
	public static void preInit(){
		File configFile = new File(Loader.instance().getConfigDir(),"CalebRatedCore.cfg");
		config = new Configuration(configFile);
		syncFromFiles();
	}
	
	public static Configuration getConfig(){
		return config;
	}
	
	public static void clientPreInit(){
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
		
	}
	public static void syncFromFiles(){
		syncConfig(true,true);
	}
	
	public static void syncFromGUI(){
		syncConfig(false,true);
	}
	
	public static void syncFromFields(){
		syncConfig(false,false);
	}
	
	private static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig){
		if(loadFromConfigFile)
			config.load();
		//This block of code required for every config entry. Data value varies - this one is boolean.
		Property propertyTinWorldGen = config.get(CATEGORY_NAME_BLOCKS,"zinc_world_gen",true);
		propertyTinWorldGen.setLanguageKey("gui.config.blocks.zinc_world_gen.name");
		propertyTinWorldGen.setComment(I18n.format("gui.config.blocks.zinc_world_gen.comment"));
		//For integer configs, setMinValue and setMaxValue.
		
		
		//Orders the config entries on the file, from top to bottom
		List<String> propertyOrderBlocks = new ArrayList<String>();
		//Add to this list with every new config entry
		propertyOrderBlocks.add(propertyTinWorldGen.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_BLOCKS, propertyOrderBlocks);
		
		if(readFieldsFromConfig){
			//Entry required for each config entry - make sure that data value matches.
			zincWorldGen = propertyTinWorldGen.getBoolean();
		}
		
		//Entry required for every config entry
		propertyTinWorldGen.set(zincWorldGen);
		
		if(config.hasChanged())
			config.save();
	}
	
	public static class ConfigEventHandler{
		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event){
			if(event.getModID().equals(CalebRatedCore.modId)){
				syncFromGUI();
			}
		}
	}
	
}
