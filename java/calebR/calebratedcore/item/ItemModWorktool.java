package calebR.calebratedcore.item;


import java.util.Set;

import com.google.common.collect.Sets;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;


//This is a custom tool, used in a similar manner to PrimalCore's work tool.
//Unfortunately I couldn't implement PrimalCore's code (not available at time), so in world crafting won't work using my tools.
public class ItemModWorktool extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {});


    public ItemModWorktool(Item.ToolMaterial material, String unlocalizedName)
    {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = 3.0F + material.getDamageVsEntity();
        this.attackSpeed = -2.4F;
    	this.setUnlocalizedName(unlocalizedName);
    	this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
    	this.setCreativeTab(CalebRatedCore.creativeTab);
    }

}
