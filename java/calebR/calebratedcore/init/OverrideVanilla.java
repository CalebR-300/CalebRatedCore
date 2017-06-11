package calebR.calebratedcore.init;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;

public class OverrideVanilla {

	public static void Init(){
//Nerf obsidian and obsidian blocks to be more like stone. Obsidian is volcanic glass... it's really not that special.
		Blocks.OBSIDIAN.setHarvestLevel("pickaxe",2);
		Blocks.OBSIDIAN.setHardness(5.0F);
		Blocks.OBSIDIAN.setResistance(30.0F);
//Obsidian furniture nerfed even more.
		Blocks.ENDER_CHEST.setHarvestLevel("pickaxe",1);
		Blocks.ENDER_CHEST.setHardness(2.0F);
		Blocks.ENDER_CHEST.setResistance(20.0F);
		Blocks.ENCHANTING_TABLE.setHarvestLevel("pickaxe", 1);
		Blocks.ENCHANTING_TABLE.setHardness(2.0F);
		Blocks.ENCHANTING_TABLE.setResistance(20.0F);
	}
}
