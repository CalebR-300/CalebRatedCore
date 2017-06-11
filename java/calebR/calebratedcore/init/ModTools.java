package calebR.calebratedcore.init;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.item.ItemModAxe;
import calebR.calebratedcore.item.ItemModHoe;
import calebR.calebratedcore.item.ItemModPickaxe;
import calebR.calebratedcore.item.ItemModSaw;
import calebR.calebratedcore.item.ItemModClippers;
import calebR.calebratedcore.item.ItemModHammer;
import calebR.calebratedcore.item.ItemModShovel;
import calebR.calebratedcore.item.ItemModSword;
import calebR.calebratedcore.item.ItemModWorktool;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
/*Create materials to use for tools - texture name, harvestLevel, durability, mining speed, damage Vs Entites, and enchantability.
 * Harvest Level determines what grade blocks can be mined, vanilla values (Wood/Gold=0, Stone=1, Iron=2, Diamond=3)
 * Durability - Number of uses until the item breaks
 * Mining Speed - How quickly the tool will work, vanilla values (Wood=2.0F, Stone=4.0F, Iron=6.0F, Diamond=8.0F)
 * Damage vs Entities - Determines damage, which is added to default damage value of tool (i.e Sword is 4)
 * Enchantability - The higher, the better the possible enchants. (Wood=15, Stone=5, Iron=14, Diamond=10, Gold=22)
 */
	public static final ToolMaterial flintMaterial = EnumHelper.addToolMaterial(CalebRatedCore.modId + ":flint", 1, 130, 4.0F, 1.0F, 5);
	public static final ToolMaterial quartzMaterial = EnumHelper.addToolMaterial(CalebRatedCore.modId + ":quartz", 2, 130, 4.0F, 1.0F, 5); //Quartz only for PrimalCore replacement
	public static final ToolMaterial bronzeMaterial = EnumHelper.addToolMaterial(CalebRatedCore.modId + ":bronze", 2, 250, 5.0F, 2.0F, 12);
	//public static final ToolMaterial castironMaterial = EnumHelper.addToolMaterial(CalebRatedCore.modId + ":castiron", 2, 250, 6.0F, 2.0F, 14); //Vanilla iron values, obviously iron, not cast iron.
	public static final ToolMaterial wroughtironMaterial = EnumHelper.addToolMaterial(CalebRatedCore.modId + ":wroughtiron", 2, 400, 6.0F, 2.0F, 14);
	public static final ToolMaterial steelMaterial = EnumHelper.addToolMaterial(CalebRatedCore.modId + ":steel", 3, 600, 8.0F, 4.0F, 10);
	
	public static ItemPickaxe itemBronzePickaxe;
	//public static ItemPickaxe itemIronPickaxe;
	
	public static ItemModAxe itemBronzeAxe; //Axe calls our modified tool class, instead of the Minecraft one, due to Forge glitch with axes
	//public static ItemModAxe itemIronAxe;
	
	public static ItemHoe itemBronzeHoe;
	//public static ItemHoe itemIronHoe;
	
	public static ItemSpade itemBronzeShovel;
	//public static ItemSpade itemIronShovel;
	
	public static ItemSword itemBronzeSword;
	//public static ItemSword itemIronSword;
	
	
	public static ItemModClippers itemFlintClippers;
	public static ItemModClippers itemQuartzClippers;
	public static ItemModClippers itemBronzeClippers;
	public static ItemModClippers itemIronClippers;
	public static ItemModClippers itemSteelClippers;

	public static ItemModWorktool itemBronzeWorktool;
	public static ItemModWorktool itemSteelWorktool;
	
	public static ItemModSaw itemBronzeSaw;
	public static ItemModSaw itemSteelSaw;
	
	public static ItemModHammer itemBronzeHammer;
	public static ItemModHammer itemSteelHammer;
	
	
	
	
	
	public static void init(){
		itemBronzePickaxe = new ItemModPickaxe(bronzeMaterial, "itemBronzePickaxe");
		//itemIronPickaxe = new ItemModPickaxe(wroughtironMaterial, "itemIronPickaxe");
		
		itemBronzeAxe = new ItemModAxe(bronzeMaterial, "itemBronzeAxe");
		//itemIronAxe = new ItemModAxe(wroughtironMaterial, "itemIronAxe");
		
		itemBronzeHoe = new ItemModHoe(bronzeMaterial, "itemBronzeHoe");
		//itemIronHoe = new ItemModHoe(wroughtironMaterial, "itemIronHoe");
		
		itemBronzeShovel = new ItemModShovel(bronzeMaterial, "itemBronzeShovel");
		//itemIronShovel = new ItemModShovel(wroughtironMaterial, "itemIronShovel");
		
		itemBronzeSword = new ItemModSword(bronzeMaterial, "itemBronzeSword");
		//itemIronSword = new ItemModSword(wroughtironMaterial, "itemIronSword");
		
		itemFlintClippers = new ItemModClippers(flintMaterial, "itemFlintClippers");
		itemQuartzClippers = new ItemModClippers(quartzMaterial, "itemQuartzClippers");
		itemBronzeClippers = new ItemModClippers(bronzeMaterial, "itemBronzeClippers");
		itemIronClippers = new ItemModClippers(wroughtironMaterial, "itemIronClippers");
		itemSteelClippers = new ItemModClippers(steelMaterial, "itemSteelClippers");
		
		itemBronzeWorktool = new ItemModWorktool(bronzeMaterial, "itemBronzeWorktool");
		itemSteelWorktool = new ItemModWorktool(steelMaterial, "itemSteelWorktool");
		
		itemBronzeSaw = new ItemModSaw(bronzeMaterial, "itemBronzeSaw");
		itemSteelSaw = new ItemModSaw(steelMaterial, "itemSteelSaw");
		
		itemBronzeHammer = new ItemModHammer(bronzeMaterial, "itemBronzeHammer");
		itemSteelHammer = new ItemModHammer(steelMaterial, "itemSteelHammer");
		

		
	}
	
	public static void register(){
		registerItem(itemBronzePickaxe);
		//registerItem(itemIronPickaxe);
		
		registerItem(itemBronzeAxe);
		//registerItem(itemIronAxe);
		
		registerItem(itemBronzeHoe);
		//registerItem(itemIronHoe);
		
		registerItem(itemBronzeShovel);
		//registerItem(itemIronShovel);
		
		registerItem(itemBronzeSword);
		//registerItem(itemIronSword);
		
		registerItem(itemFlintClippers);
		registerItem(itemQuartzClippers);
		registerItem(itemBronzeClippers);
		registerItem(itemIronClippers);
		registerItem(itemSteelClippers);
		
		registerItem(itemBronzeWorktool);
		registerItem(itemSteelWorktool);
		
		registerItem(itemBronzeSaw);
		registerItem(itemSteelSaw);
		
		registerItem(itemBronzeHammer);
		registerItem(itemSteelHammer);

		
	}
	
	public static void registerRenders(){
		registerRender(itemBronzePickaxe);
		//registerRender(itemIronPickaxe);
		
		registerRender(itemBronzeAxe);
		//registerRender(itemIronAxe);
		
		registerRender(itemBronzeHoe);
		//registerRender(itemIronHoe);
		
		registerRender(itemBronzeShovel);
		//registerRender(itemIronShovel);
		
		registerRender(itemBronzeSword);
		//registerRender(itemIronSword);
		
		registerRender(itemFlintClippers);
		registerRender(itemQuartzClippers);
		registerRender(itemBronzeClippers);
		registerRender(itemIronClippers);
		registerRender(itemSteelClippers);
		
		registerRender(itemBronzeWorktool);
		registerRender(itemSteelWorktool);
		
		registerRender(itemBronzeSaw);
		registerRender(itemSteelSaw);
		
		registerRender(itemBronzeHammer);
		registerRender(itemSteelHammer);

	}
	 
	public static void registerItem(Item item){
		 GameRegistry.register(item);
	 }
	 
	 public static void registerRender(Item item){
		 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(CalebRatedCore.modId,item.getUnlocalizedName().substring(5)),"inventory"));
		 
	 }
	
}
