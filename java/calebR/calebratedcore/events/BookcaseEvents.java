package calebR.calebratedcore.events;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//Book cases will drop themselves, and won't require a tool.
//Originally code was more complex (tool/player checks), but I changed my mind.
public class BookcaseEvents {
		@SubscribeEvent
		public void breakBookshelf(BlockEvent.HarvestDropsEvent event){
			if(event.getState().getBlock() == Blocks.BOOKSHELF){
			event.getDrops().clear();
			event.getDrops().add(new ItemStack(Blocks.BOOKSHELF, 1));		
		}
	}
}
