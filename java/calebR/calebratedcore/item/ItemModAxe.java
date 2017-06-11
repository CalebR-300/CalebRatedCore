package calebR.calebratedcore.item;

import java.util.Set;

import com.google.common.collect.Sets;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;

//Axe code is different, owing to glitch in Forge
public class ItemModAxe extends ItemTool  

   
    {
        private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});


        public ItemModAxe(Item.ToolMaterial material, String unlocalizedName)
        {
            super(material, EFFECTIVE_ON);
            this.damageVsEntity = 6.0F + material.getDamageVsEntity();
            this.attackSpeed = -3.1F;
        	this.setUnlocalizedName(unlocalizedName);
        	this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
        	this.setCreativeTab(CalebRatedCore.creativeTab);
        	this.setHarvestLevel("axe",2);
        }


        public float getStrVsBlock(ItemStack stack, IBlockState state)
        {
            Material material = state.getMaterial();
            return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
        }
    }


