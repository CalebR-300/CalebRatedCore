package calebR.calebratedcore.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ModConfigGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return ModConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
		return null;
	}
	
	public static class ModConfigGui extends GuiConfig{
		public ModConfigGui(GuiScreen parentScreen){
			super(parentScreen, getConfigElements(),CalebRatedCore.modId,false,false,I18n.format("gui.config.main_title"));
		}

		private static List<IConfigElement> getConfigElements() {
			List<IConfigElement> list = new ArrayList<IConfigElement>();
			//Line needs to be added for every Category in config
			list.add(new DummyCategoryElement(I18n.format("gui.config.category.blocks"),"gui.config.category.blocks",CategoryEntryBlocks.class));
			return list;
		}
		
		public static class CategoryEntryBlocks extends CategoryEntry{

			public CategoryEntryBlocks(GuiConfig owningScreen, GuiConfigEntries owningEntryList,
					IConfigElement configElement) {
				super(owningScreen, owningEntryList, configElement);
			}
			
			@Override
			protected GuiScreen buildChildScreen() {
				Configuration config = ModConfig.getConfig();
				//Add a new block for every category
				ConfigElement categoryBlocks = new ConfigElement(config.getCategory(ModConfig.CATEGORY_NAME_BLOCKS));
				List<IConfigElement> propertiesOnScreen = categoryBlocks.getChildElements();
				String windowTitle = I18n.format("gui.config.category.blocks");
				return new GuiConfig(owningScreen, propertiesOnScreen, owningScreen.modID, this.configElement.requiresWorldRestart()||this.owningScreen.allRequireWorldRestart,this.configElement.requiresMcRestart()||this.owningScreen.allRequireMcRestart,windowTitle);
			}
			
		}
	}

}
