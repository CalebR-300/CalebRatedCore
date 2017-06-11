package calebR.calebratedcore.item;


import java.util.Set;

import com.google.common.collect.Sets;

import calebR.calebratedcore.CalebRatedCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;

public class ItemModClippers extends ItemTool {


public static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[] {});
private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};

public ItemModClippers(ToolMaterial material,String unlocalizedName) {
	super(material, EFFECTIVE_BLOCKS);
	this.setUnlocalizedName(unlocalizedName);
	this.attackSpeed = -2.8F;
	this.setRegistryName(new ResourceLocation(CalebRatedCore.modId,unlocalizedName));
	this.setCreativeTab(CalebRatedCore.creativeTab);
}

//Called when Block is Destroyed, adds to the Blocks Sheared statistic.
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
	{
	stack.damageItem(1, entityLiving);
	Block block = state.getBlock();
	return state.getMaterial() != Material.LEAVES && block != Blocks.WEB && block != Blocks.TALLGRASS && block != Blocks.VINE && block != Blocks.TRIPWIRE && block != Blocks.WOOL && !(state instanceof net.minecraftforge.common.IShearable) ? super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving) : true;
	}

//Checks if the item can harvest the block in question.
	public boolean canHarvestBlock(IBlockState blockIn)
	{
	Block block = blockIn.getBlock();
	return block == Blocks.WEB || block == Blocks.REDSTONE_WIRE || block == Blocks.TRIPWIRE;
	}

	public float getStrVsBlock(ItemStack stack, IBlockState state)
	{
	Block block = state.getBlock();
	return block != Blocks.WEB && state.getMaterial() != Material.LEAVES ? (block == Blocks.WOOL ? 5.0F : super.getStrVsBlock(stack, state)) : 15.0F;
	}

//Checks if the entity can be sheared. Normally sheep. If so, item is dropped.
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, net.minecraft.entity.player.EntityPlayer player, EntityLivingBase entity, net.minecraft.util.EnumHand hand)
	{
	if (entity.worldObj.isRemote)
	{
	return false;
	}
	if (entity instanceof net.minecraftforge.common.IShearable)
	{
	net.minecraftforge.common.IShearable target = (net.minecraftforge.common.IShearable)entity;
	BlockPos pos = new BlockPos(entity.posX, entity.posY, entity.posZ);
	if (target.isShearable(itemstack, entity.worldObj, pos))
	{
	java.util.List<ItemStack> drops = target.onSheared(itemstack, entity.worldObj, pos,
	net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, itemstack));

	java.util.Random rand = new java.util.Random();
	for(ItemStack stack : drops)
	{
		//This code-block replaces Wool drops for my custom Fleece item.
		if(stack.getItem() == Item.getItemFromBlock(Blocks.WOOL)){
			net.minecraft.entity.item.EntityItem ent = entity.dropItem(calebR.calebratedcore.init.ModItems.itemFleece, 1);
			ent.motionY += rand.nextFloat() * 0.05F;
			ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
			ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;			
		}else{
			net.minecraft.entity.item.EntityItem ent = entity.entityDropItem(stack, 1.0F);
			ent.motionY += rand.nextFloat() * 0.05F;
			ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
			ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;				
		}
	}
	itemstack.damageItem(1, entity);
	}
	return true;
	}
	return false;
	}
	
//Checks if block can be sheared, and if so, drops the block.
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, net.minecraft.entity.player.EntityPlayer player)
	{
	if (player.worldObj.isRemote || player.capabilities.isCreativeMode)
	{
	return false;
	}
	Block block = player.worldObj.getBlockState(pos).getBlock();
	if (block instanceof net.minecraftforge.common.IShearable)
	{
	net.minecraftforge.common.IShearable target = (net.minecraftforge.common.IShearable)block;
	if (target.isShearable(itemstack, player.worldObj, pos))
	{
	java.util.List<ItemStack> drops = target.onSheared(itemstack, player.worldObj, pos,
	net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, itemstack));
	java.util.Random rand = new java.util.Random();

	for(ItemStack stack : drops)
	{
	float f = 0.7F;
	double d = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	net.minecraft.entity.item.EntityItem entityitem = new net.minecraft.entity.item.EntityItem(player.worldObj, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
	entityitem.setDefaultPickupDelay();
	player.worldObj.spawnEntityInWorld(entityitem);
	}

	itemstack.damageItem(1, player);
	player.addStat(net.minecraft.stats.StatList.getBlockStats(block));
	}
	}
	return false;
	}
}
