package calebR.calebratedcore.handlers;

import calebR.calebratedcore.events.BookcaseEvents;
import calebR.calebratedcore.events.DropEvents;
import calebR.calebratedcore.events.GlassEvents;
import calebR.calebratedcore.events.ObsidianEvents;
import calebR.calebratedcore.events.NoAppleEvent;
import calebR.calebratedcore.events.StoneEvents;
import calebR.calebratedcore.events.WoodEvents;
import net.minecraftforge.common.MinecraftForge;

public class EventfulHandler {
	
	public static void registerEvents(){
		MinecraftForge.EVENT_BUS.register(new WoodEvents());
		MinecraftForge.EVENT_BUS.register(new DropEvents());
		MinecraftForge.EVENT_BUS.register(new StoneEvents());
		MinecraftForge.EVENT_BUS.register(new BookcaseEvents());
		MinecraftForge.EVENT_BUS.register(new NoAppleEvent());
		MinecraftForge.EVENT_BUS.register(new GlassEvents());
		MinecraftForge.EVENT_BUS.register(new ObsidianEvents());
	}
	
}
