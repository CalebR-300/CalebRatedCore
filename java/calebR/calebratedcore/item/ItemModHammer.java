package calebR.calebratedcore.item;

import java.util.Set;

import com.google.common.collect.Sets;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;

//Another Primalcore style tool/weapon. Since code wasn't available, in-world recipes won't work with my tools.
public class ItemModHammer extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {});


    public ItemModHammer(Item.ToolMaterial material, String unlocalizedName)
    {
        super(material, EFFECTIVE_ON);
        this.damageVsEntity = 5.0F + material.getDamageVsEntity();
        this.attackSpeed = -3.2F;
    	this.setUnlocalizedName(unlocalizedName);
    	this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
    	this.setCreativeTab(CalebRatedCore.creativeTab);
    }


}
