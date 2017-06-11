package calebR.calebratedcore.events;

import java.util.Random;

import calebR.calebratedcore.init.ModItems;
import calebR.calebratedcore.item.ItemBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraftforge.common.IShearable;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropEvents {
 
 //Sheep drop mutton on death, with a chance of fleece. Prevents wool exploit (killing sheep instead of shearing).
 @SubscribeEvent
 public void sheepDeath(LivingDropsEvent event)
 {
 if(event.getEntityLiving() instanceof EntitySheep)
 {
		Random random = new Random();
		if(random.nextInt(2) == 0) {
		 	event.getEntityLiving().dropItem(ModItems.itemFleece,1);
		 	event.getEntityLiving().dropItem(Items.MUTTON, 2);	
		 	event.getDrops().clear();			
		}
		else{
		 	event.getEntityLiving().dropItem(Items.MUTTON, 2);	
		 	event.getDrops().clear();	
		}

 }
 }

}