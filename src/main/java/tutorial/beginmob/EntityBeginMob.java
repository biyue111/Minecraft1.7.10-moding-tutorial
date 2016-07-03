package tutorial.beginmob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ai.*;
import net.minecraft.world.World;

public class EntityBeginMob extends EntityAnimal{

	public EntityBeginMob(World p_i1681_1_) {
		super(p_i1681_1_);
		this.setSize(2.0F, 2.0F);
		this.tasks.addTask(0, new EntityAIPanic(this, 0.75D));
		this.tasks.addTask(1, new EntityAIMate(this, 0.75D)); 
		this.tasks.addTask(2, new EntityAITempt(this, 1.0D, Items.apple, false));
		this.tasks.addTask(3, new EntityAIWander(this, 0.25D));
	}
	
    public boolean isAIEnabled(){
        return true;
    }
    
    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.75D);
    }
    
    public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_.getItem() == Items.apple;
    }

	public EntityBeginMob createChild(EntityAgeable p_90011_1_) {
		
		return new EntityBeginMob(this.worldObj);
	}

}
