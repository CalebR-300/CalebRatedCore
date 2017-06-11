package calebR.calebratedcore.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import calebR.calebratedcore.item.ItemModClippers;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//Removes apples from leaf drops
public class NoAppleEvent {

	@SubscribeEvent
		public void noApples(HarvestDropsEvent event) {
		if(event.getState().getBlock()==Blocks.LEAVES){
			int drops = event.getDrops().size();
			
			for(int i = 0; i<drops; i++){
				if(event.getDrops().get(i).getItem()==Items.APPLE){
					event.getDrops().remove(i);
				}
			}
		}
	}
}
