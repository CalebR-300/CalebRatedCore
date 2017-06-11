package calebR.calebratedcore;

import calebR.calebratedcore.client.ModTab;
import calebR.calebratedcore.config.ModConfig;
import calebR.calebratedcore.events.DropEvents;
import calebR.calebratedcore.events.WoodEvents;
import calebR.calebratedcore.handlers.EventfulHandler;
import calebR.calebratedcore.handlers.OreDictionaryHandler;
import calebR.calebratedcore.init.ModArmour;
import calebR.calebratedcore.init.ModBlocks;
import calebR.calebratedcore.init.ModItems;
import calebR.calebratedcore.init.ModTools;
import calebR.calebratedcore.init.OverrideVanilla;
import calebR.calebratedcore.proxy.CommonProxy;
import calebR.calebratedcore.util.Utils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//This file format is pretty standard for all Minecraft Forge Mods
@Mod(modid = CalebRatedCore.modId, name = CalebRatedCore.name, version = CalebRatedCore.version, acceptedMinecraftVersions = "[1.10.2]", guiFactory = CalebRatedCore.guiFactory)
public class CalebRatedCore {

	@SidedProxy(serverSide = "calebR.calebratedcore.proxy.CommonProxy", clientSide = "calebR.calebratedcore.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "calebratedcore";
	public static final String name = "CalebRatedCore";
	public static final String version = "1.1.4";
	public static final ModTab creativeTab = new ModTab();
	public static final String guiFactory = "calebR.calebratedcore.config.ModConfigGuiFactory";
	
	@Mod.Instance(modId)
	public static CalebRatedCore instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		

		//Pre-initializes config file
		ModConfig.preInit();
		//All base classes need to be initialized and registered on startup
		//Remember to update your client proxy too!
		
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
		ModTools.init();
		ModTools.register();
		ModArmour.init();
		ModArmour.register();
		//Register the renders for the client
		proxy.registerRenders();

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//Initialize the ore dictionary handler - currently disabled.
		OreDictionaryHandler.registerOreDictionary();
		
		//Initialize events
		EventfulHandler.registerEvents();
		
		//Initialize world generation - handled by server
		proxy.init();
		
		
		//Meta items/blocks need to be registered
		proxy.registerModelBakeryStuff();

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//Nothing here yet
		OverrideVanilla.Init();

	}
}
