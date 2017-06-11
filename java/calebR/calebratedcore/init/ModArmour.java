package calebR.calebratedcore.init;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.item.ItemModArmour;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmour {

	/*Assign material name, name of texture, durability*, Reduction amount, enchantability, sound played when armour worn, and toughness
	//*Durability number multiplied by a factor for each piece (helmet*11, chestplate*16, leggings*15, boots*13)
	//Reduction amount - damage reduced per each piece of armour (helmet/chestplate/leggings/boots). Total should not equal or exceed 25.
	//Enchantability - Higher the number, the more likely you'll get good enchants. Vanilla values (Leather=15, Chain=12, Iron=9, Gold=25, Diamond=10)
	//Toughness - Factor that determines how effective armour is at stopping large attacks. Larger the better, although increase in defense diminishes at higher numbers.
	*/
	public static ArmorMaterial bronzeMaterial = EnumHelper.addArmorMaterial("bronze", CalebRatedCore.modId+":bronze", 15, new int[]{2,6,5,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	public static ItemArmor itemBronzeHelmet;
	public static ItemArmor itemBronzeChestplate;
	public static ItemArmor itemBronzeLeggings;
	public static ItemArmor itemBronzeBoots;
	
	
	public static void init(){
		//Initialise armour. Important to note that leggings on layer 2, not 1.
		itemBronzeHelmet = new ItemModArmour(bronzeMaterial,1,EntityEquipmentSlot.HEAD,"itemBronzeHelmet");
		itemBronzeChestplate = new ItemModArmour(bronzeMaterial,1,EntityEquipmentSlot.CHEST,"itemBronzeChestplate");
		itemBronzeLeggings = new ItemModArmour(bronzeMaterial,2,EntityEquipmentSlot.LEGS,"itemBronzeLeggings");
		itemBronzeBoots = new ItemModArmour(bronzeMaterial,1,EntityEquipmentSlot.FEET,"itemBronzeBoots");
	}
	
	public static void register(){
		registerItem(itemBronzeHelmet);
		registerItem(itemBronzeChestplate);
		registerItem(itemBronzeLeggings);
		registerItem(itemBronzeBoots);
	}
	
	public static void registerRenders(){
		registerRender(itemBronzeHelmet);
		registerRender(itemBronzeChestplate);
		registerRender(itemBronzeLeggings);
		registerRender(itemBronzeBoots);
	}
	
	 public static void registerItem(Item item){
		 GameRegistry.register(item);
	 }
	 
	 public static void registerRender(Item item){
		 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(CalebRatedCore.modId,item.getUnlocalizedName().substring(5)),"inventory"));
		 
	 }
	
}
