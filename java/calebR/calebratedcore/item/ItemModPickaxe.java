package calebR.calebratedcore.item;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
		this.setCreativeTab(CalebRatedCore.creativeTab);
	}

}
