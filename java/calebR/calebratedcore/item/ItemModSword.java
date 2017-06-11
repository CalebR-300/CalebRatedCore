package calebR.calebratedcore.item;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;

public class ItemModSword extends ItemSword {

	public ItemModSword(ToolMaterial material,String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
		this.setCreativeTab(CalebRatedCore.creativeTab);
	}

}
