package calebR.calebratedcore.item;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ItemModArmour extends ItemArmor {

	public ItemModArmour(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
		this.setCreativeTab(CalebRatedCore.creativeTab);
	}

}
