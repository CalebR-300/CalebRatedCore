package calebR.calebratedcore.item;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{
 
 protected String name;
 
 public ItemBase(String name) {
 this.name = name;
 setUnlocalizedName(name);
 setRegistryName(name);
 setCreativeTab(CalebRatedCore.creativeTab);
 }
 

 @Override
 public ItemBase setCreativeTab(CreativeTabs tab) {
 super.setCreativeTab(tab);
 return this;
 }

}