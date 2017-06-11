package calebR.calebratedcore.events;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//This event handles drops for other blocks normally obtainable with silk touch
//Currently ender chests and enchantment tables
//Planning on custom recipes for ice, grass and variants, so I'll leave vanilla code alone for those blocks.
public class ObsidianEvents {
	@SubscribeEvent
	public void breakEnderChest(BlockEvent.HarvestDropsEvent event){
		if(event.getState().getBlock() == Blocks.ENDER_CHEST||event.getState().getBlock() == Blocks.ENCHANTING_TABLE){
			Block block = event.getState().getBlock();
			event.getDrops().clear();
			event.getDrops().add(new ItemStack(block,1));	
	}
}

}
