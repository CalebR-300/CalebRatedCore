package calebR.calebratedcore.events;

import java.util.Random;

import org.fusesource.jansi.Ansi.Color;

import calebR.calebratedcore.item.ItemModAxe;
import calebR.calebratedcore.item.ItemModClippers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//Code sourced off Choonster's Test3 mod - https://github.com/Choonster-Minecraft-Mods/TestMod3/blob/1.11.2/src/main/java/choonster/testmod3/event/BlockEventHandler.java
public class WoodEvents {

//Tests if block can be broken with the tool.
	private boolean canToolHarvestBlock(IBlockState state, ItemStack stack) {
		final String tool = state.getBlock().getHarvestTool(state);
		return stack != null && tool != null
				&& stack.getItem().getHarvestLevel(stack, tool) >= state.getBlock().getHarvestLevel(state);
	}

//Tests that an axe is being used on the wood. Limited to logs. Will eventually extend this to all wooden items.
	private boolean isPlayerHarvestingLogWithoutCorrectTool(IBlockState state, IBlockAccess blockAccess, BlockPos pos, EntityPlayer player) {
		return player != null && !player.capabilities.isCreativeMode
				&& state.getBlock().isWood(blockAccess, pos)
				&& !canToolHarvestBlock(state, player.getHeldItemMainhand());
	}
	
//Leaf drops - has a chance to drop a stick, provided you're not using shears.
//Annoying exploit - Saplings still drop from leaves, even when sheared. This means you can potentially get infinite saplings from a single leaf block (provided you have shears to burn).
	EntityPlayer harvester;
	@SubscribeEvent
		public void harvestDrops(BlockEvent.HarvestDropsEvent event) {
		if (event.getState().getBlock().isLeaves(event.getState(), event.getWorld(), event.getPos()))
			harvester = event.getHarvester();
			if(harvester!=null){
				ItemStack stack = harvester.inventory.getCurrentItem();
				if(stack!=null){
					if(stack.getItem() instanceof ItemModClippers||stack.getItem() instanceof ItemShears){
						event.getDrops().clear();
						//event.getDrops().add(new ItemStack(block,1,meta));
						}else{
							Random random = new Random();
							//Replace nextInt() to a higher number to decrease odds, lower to increase odds.
								if(random.nextInt(2) == 0) {
									event.getDrops().add(new ItemStack(Items.STICK, 1));
								}		
				}	
			}else{
				Random random = new Random();
			//Replace nextInt() to a higher number to decrease odds, lower to increase odds.
				if(random.nextInt(2) == 0) {
					event.getDrops().add(new ItemStack(Items.STICK, 1));
				}
			}

	}
}

//Makes wood unbreakable with incorrect tool
	@SubscribeEvent
	public void breakSpeed(PlayerEvent.BreakSpeed event) {
		if (isPlayerHarvestingLogWithoutCorrectTool(event.getState(), event.getEntityPlayer().getEntityWorld(), event.getPos(), event.getEntityPlayer())) {
			event.setCanceled(true);
		}
	}
	
	

	//Put this in its own events class. Remember to add variants for glass, glass pane, and stained glass pane
	/*@SubscribeEvent
	public void GlassDrops (HarvestDropsEvent event) {
		if(event.getState().getBlock().equals(Blocks.STAINED_GLASS)) {
			int meta = event.getState().getBlock().getMetaFromState(event.getState());
			event.getDrops().add(new ItemStack(Blocks.STAINED_GLASS,1,meta));
		}
	}*/
	
}
