package calebR.calebratedcore.item;

import java.util.Set;

import com.google.common.collect.Sets;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;

//Another PrimalCore-like tool. Fortunately this one should work the same as the standard ones.
public class ItemModSaw extends ItemTool {
	//Theoretically, I could make the saw effective on timber items, but I'd prefer not to do that.
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {});


    public ItemModSaw(Item.ToolMaterial material, String unlocalizedName)
    {
        super(material, EFFECTIVE_ON);
        //PrimalCore's saws couldn't be used as weapons. Mine can be... although they are pretty rubbish.
        this.damageVsEntity = -1.0F + material.getDamageVsEntity();
        this.attackSpeed = -2.0F;
    	this.setUnlocalizedName(unlocalizedName);
    	this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
    	this.setCreativeTab(CalebRatedCore.creativeTab);
    }

}
