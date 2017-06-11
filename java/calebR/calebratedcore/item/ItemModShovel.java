package calebR.calebratedcore.item;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;

public class ItemModShovel extends ItemSpade {

	public ItemModShovel(ToolMaterial material,String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
		this.setCreativeTab(CalebRatedCore.creativeTab);
	}

}
