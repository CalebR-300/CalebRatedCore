package calebR.calebratedcore.events;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//Makes glass drop itself. No tool or entity checks, so even TNT can harvest glass (when it isn't obliterated).
public class GlassEvents {
	@SubscribeEvent
	public void GlassDrops (HarvestDropsEvent event) {
		if(event.getState().getBlock().equals(Blocks.STAINED_GLASS)||event.getState().getBlock().equals(Blocks.GLASS)||event.getState().getBlock().equals(Blocks.GLASS_PANE)||event.getState().getBlock().equals(Blocks.STAINED_GLASS_PANE)) {

				Block block = event.getState().getBlock();
				int meta = event.getState().getBlock().getMetaFromState(event.getState());
				event.getDrops().add(new ItemStack(block,1,meta));	
		}
	}
}
