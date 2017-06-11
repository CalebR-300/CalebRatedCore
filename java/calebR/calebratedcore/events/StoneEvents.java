package calebR.calebratedcore.events;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


//Make vanilla stone drop itself. Code had bugs in the past, but seems to be fixed.
public class StoneEvents {
	@SubscribeEvent
	public void onHarvestBlock(BlockEvent.HarvestDropsEvent event){
				if(event.getState().getBlock() == Blocks.STONE)
		{
					if(event.getState().getValue(BlockStone.VARIANT) == BlockStone.EnumType.STONE){
						event.getDrops().clear();
						event.getDrops().add(new ItemStack(Blocks.STONE, 1));	
					}

		}

	}
}
