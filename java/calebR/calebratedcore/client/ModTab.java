package calebR.calebratedcore.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.init.ModItems;

public class ModTab extends CreativeTabs{

	public ModTab() {
		super(CalebRatedCore.modId);
		//setBackgroundImageName("[imagename].png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.itemInterfaceScreen; //shown icon on creative tab
	}
	
	 @Override
	 public boolean hasSearchBar() {
		 return true; // return false if you don't want search bar
	 }

}