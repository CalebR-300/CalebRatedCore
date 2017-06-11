package calebR.calebratedcore.init;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.config.ModConfig;
import calebR.calebratedcore.handlers.EnumHandler;
import calebR.calebratedcore.item.ItemBase;
import calebR.calebratedcore.item.ItemBoardWood;
import calebR.calebratedcore.item.ItemModBrick;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	
	public static ItemBase itemInterfaceScreen;
	public static ItemBoardWood itemBoardWood;
	public static ItemBase itemFleece;
	public static ItemModBrick itemBrick;
	public static ItemBase itemCrushedBauxite;
	public static ItemBase itemCrushedNickel;
	public static ItemBase itemCrushedZinc;
	public static ItemBase itemWoodPulp;
	public static ItemBase itemDustSand;
	public static ItemBase itemTinyGlass;
	public static ItemBase itemDustGlass;
	public static ItemBase itemPlateSilicon;
	public static ItemBase itemTinySilicon;
	public static ItemBase itemPurifiedNickel;
	public static ItemBase itemPurifiedBauxite;
	public static ItemBase itemPurifiedZinc;
	public static ItemBase itemTinyQuartz;
	public static ItemBase itemDustTinyNickel;
	public static ItemBase itemDustTinyBauxite;
	public static ItemBase itemDustTinyZinc;
	public static ItemBase itemNuggetRedmetal;
	public static ItemBase itemGritInvar;
	public static ItemBase itemPlateSlate;
	public static ItemBase itemDustTinyRedstone;
	public static ItemBase itemDustTinyGlowstone;
	public static ItemBase itemDustTinyGunpowder;
	public static ItemBase itemTinyClay;
	public static ItemBase itemNuggetCokeCoal;
	public static ItemBase itemNuggetPlastic;
	public static ItemBase itemIngotPlastic;
	public static ItemBase itemDustDirt;
	public static ItemBase itemCastCeramic;
	public static ItemBase itemCastUnfired;
	public static ItemBase itemRodBronze;
	public static ItemBase itemRodSilver;
	public static ItemBase itemRodInvar;
	public static ItemBase itemRodBrass;
	public static ItemBase itemPiston;
	public static ItemBase itemSpeaker;
	public static ItemBase itemWireRedmetal;
	public static ItemBase itemGearWood;
	public static ItemBase itemPlasticWeave;
	
	

	 
	 public static void init() {
		 itemInterfaceScreen = new ItemBase("itemInterfaceScreen");
		 itemBoardWood = new ItemBoardWood("itemBoardWood");
		 itemFleece = new ItemBase("itemFleece");
		 itemBrick = new ItemModBrick("itemBrick");
		 itemCrushedBauxite = new ItemBase("itemCrushedBauxite");
		 itemCrushedNickel = new ItemBase("itemCrushedNickel");
		 itemCrushedZinc = new ItemBase("itemCrushedZinc");
		 itemWoodPulp = new ItemBase("itemWoodPulp");
		 itemDustSand = new ItemBase("itemDustSand");
		 itemTinyGlass = new ItemBase("itemTinyGlass");
		 itemDustGlass = new ItemBase("itemDustGlass");
		 itemPlateSilicon = new ItemBase("itemPlateSilicon");
		 itemTinySilicon = new ItemBase("itemTinySilicon");
		 itemPurifiedNickel = new ItemBase("itemPurifiedNickel");
		 itemPurifiedBauxite = new ItemBase("itemPurifiedBauxite");
		 itemPurifiedZinc = new ItemBase("itemPurifiedZinc");
		 itemTinyQuartz = new ItemBase("itemTinyQuartz");
		 itemDustTinyNickel = new ItemBase("itemDustTinyNickel");
		 itemDustTinyBauxite = new ItemBase("itemDustTinyBauxite");
		 itemDustTinyZinc = new ItemBase("itemDustTinyZinc");
		 itemNuggetRedmetal = new ItemBase("itemNuggetRedmetal");
		 itemGritInvar = new ItemBase("itemGritInvar");
		 itemPlateSlate = new ItemBase("itemPlateSlate");
		 itemDustTinyRedstone = new ItemBase("itemDustTinyRedstone");
		 itemDustTinyGlowstone = new ItemBase("itemDustTinyGlowstone");
		 itemDustTinyGunpowder = new ItemBase("itemDustTinyGunpowder");
		 itemTinyClay = new ItemBase("itemTinyClay");
		 itemNuggetCokeCoal = new ItemBase("itemNuggetCokeCoal");
		 itemNuggetPlastic = new ItemBase("itemNuggetPlastic");
		 itemIngotPlastic = new ItemBase("itemIngotPlastic");
		 itemDustDirt = new ItemBase("itemDustDirt");
		 itemCastCeramic = new ItemBase("itemCastCeramic");
		 itemCastUnfired = new ItemBase("itemCastUnfired");
		 itemRodBronze = new ItemBase("itemRodBronze");
		 itemRodSilver = new ItemBase("itemRodSilver");
		 itemRodInvar = new ItemBase("itemRodInvar");
		 itemRodBrass = new ItemBase("itemRodBrass");
		 itemPiston = new ItemBase("itemPiston");
		 itemSpeaker = new ItemBase("itemSpeaker");
		 itemWireRedmetal = new ItemBase("itemWireRedmetal");
		 itemGearWood = new ItemBase("itemGearWood");
		 itemPlasticWeave = new ItemBase("itemPlasticWeave");
		 
	


	 }
	 
	 public static void register(){
		 registerItem(itemInterfaceScreen);
		 registerItem(itemBoardWood);
		 registerItem(itemFleece);
		 registerItem(itemBrick);
		 registerItem(itemCrushedBauxite);
		 registerItem(itemCrushedNickel);
		 registerItem(itemCrushedZinc);
		 registerItem(itemWoodPulp);
		 registerItem(itemDustSand);
		 registerItem(itemTinyGlass);
		 registerItem(itemDustGlass);
		 registerItem(itemPlateSilicon);
		 registerItem(itemTinySilicon);
		 registerItem(itemPurifiedNickel);
		 registerItem(itemPurifiedBauxite);
		 registerItem(itemPurifiedZinc);
		 registerItem(itemTinyQuartz);
		 registerItem(itemDustTinyNickel);
		 registerItem(itemDustTinyBauxite);
		 registerItem(itemDustTinyZinc);
		 registerItem(itemNuggetRedmetal);
		 registerItem(itemGritInvar);
		 registerItem(itemPlateSlate);
		 registerItem(itemDustTinyRedstone);
		 registerItem(itemDustTinyGlowstone);
		 registerItem(itemDustTinyGunpowder);
		 registerItem(itemTinyClay);
		 registerItem(itemNuggetCokeCoal);
		 registerItem(itemNuggetPlastic);
		 registerItem(itemIngotPlastic);
		 registerItem(itemDustDirt);
		 registerItem(itemCastCeramic);
		 registerItem(itemCastUnfired);
		 registerItem(itemRodBronze);
		 registerItem(itemRodSilver);
		 registerItem(itemRodInvar);
		 registerItem(itemRodBrass);
		 registerItem(itemPiston);
		 registerItem(itemSpeaker);
		 registerItem(itemWireRedmetal);
		 registerItem(itemGearWood);
		 registerItem(itemPlasticWeave);
		 
		 

	 }
	 
	 public static void registerRenders(){
		 registerRender(itemInterfaceScreen);
		 registerRender(itemFleece);
		 registerRender(itemCrushedBauxite);
		 registerRender(itemCrushedNickel);
		 registerRender(itemCrushedZinc);
		 registerRender(itemWoodPulp);
		 registerRender(itemDustSand);
		 registerRender(itemTinyGlass);
		 registerRender(itemDustGlass);
		 registerRender(itemPlateSilicon);
		 registerRender(itemTinySilicon);
		 registerRender(itemPurifiedNickel);
		 registerRender(itemPurifiedBauxite);
		 registerRender(itemPurifiedZinc);
		 registerRender(itemTinyQuartz);
		 registerRender(itemDustTinyNickel); 
		 registerRender(itemDustTinyBauxite);
		 registerRender(itemDustTinyZinc);
		 registerRender(itemNuggetRedmetal);
		 registerRender(itemGritInvar);
		 registerRender(itemPlateSlate);
		 registerRender(itemDustTinyRedstone);
		 registerRender(itemDustTinyGlowstone);
		 registerRender(itemDustTinyGunpowder);
		 registerRender(itemTinyClay);
		 registerRender(itemNuggetCokeCoal);
		 registerRender(itemNuggetPlastic);
		 registerRender(itemIngotPlastic);
		 registerRender(itemDustDirt);
		 registerRender(itemCastCeramic);
		 registerRender(itemCastUnfired);
		 registerRender(itemRodBronze);
		 registerRender(itemRodSilver);
		 registerRender(itemRodInvar);
		 registerRender(itemRodBrass);
		 registerRender(itemPiston);
		 registerRender(itemSpeaker);
		 registerRender(itemWireRedmetal);
		 registerRender(itemGearWood);
		 registerRender(itemPlasticWeave);
		
		 
		 
		 
		 for(int i = 0; i < EnumHandler.WoodBoardTypes.values().length; i++){
			 registerRender(itemBoardWood, i, "itemBoardWood" + EnumHandler.WoodBoardTypes.values()[i].getName()); 
		 }
		 
		 for(int i = 0; i < EnumHandler.BrickTypes.values().length; i++){
			 registerRender(itemBrick, i, "itemBrick" + EnumHandler.BrickTypes.values()[i].getName()); 
		 }

	 }
	 
	 public static void registerItem(Item item){
		 GameRegistry.register(item);
	 }
	 
	 public static void registerRender(Item item){
		 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(CalebRatedCore.modId,item.getUnlocalizedName().substring(5)),"inventory"));
		 
	 }
	 public static void registerRender(Item item, int meta, String filename){
		 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(CalebRatedCore.modId,filename),"inventory"));
		 
	 }
	

}