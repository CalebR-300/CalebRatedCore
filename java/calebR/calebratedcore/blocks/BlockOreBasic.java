package calebR.calebratedcore.blocks;

import java.util.Random;

import calebR.calebratedcore.CalebRatedCore;
import calebR.calebratedcore.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BlockOreBasic extends Block {

	public BlockOreBasic(String unLocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unLocalizedName);
		this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,registryName));
		this.setCreativeTab(CalebRatedCore.creativeTab);
		this.setHardness(3);
		this.setResistance(10);
		this.setHarvestLevel("pickaxe", 0); //Can be broken with any pickaxe.
	}
	
	
//My custom tin drops are disabled. Code below is for reference.

	/*@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.itemChunkTin;
	}
	
	
	@Override
	public int quantityDropped(IBlockState state,int fortune,Random rand){
		int chance = rand.nextInt(4+fortune);
		
		if(chance==0){
			return 1;	
		}else if(chance==1){
			return 1;
		}else if(chance==2){
			return 2;
		}else if(chance==3){
			return 3;
		}else if(chance==4){
			return 4;
		}else if(chance==5){
			return 4;
		}else if(chance==6){
			return 4;
		}else{
			return 1;
		}
		
	}
*/

}
