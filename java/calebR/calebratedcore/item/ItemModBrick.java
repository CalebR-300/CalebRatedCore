package calebR.calebratedcore.item;

import java.util.List;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.handlers.EnumHandler.BrickTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemModBrick extends Item{
	 protected String name;
	 public ItemModBrick(String name) {
		 this.name = name;
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 this.setHasSubtypes(true);
		 setCreativeTab(CalebRatedCore.creativeTab);
		 }
	 @Override
	 public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
	 	for(int i = 0; i < BrickTypes.values().length; i++){
	 		items.add(new ItemStack(item, 1, i));
	 	}
	 }

	 @Override
	 public String getUnlocalizedName(ItemStack stack) {
	 	for(int i = 0; i < BrickTypes.values().length; i++){
	 		if(stack.getItemDamage() == i){
	 			return this.getUnlocalizedName() + "." + BrickTypes.values()[i].getName();
	 		}
	 		else{
	 			continue;
	 		}
	 	}
	 	return this.getUnlocalizedName() + "." + BrickTypes.STONE.getName();
	 }
}
