package tutorial.beginmob;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import tutorial.beginner.Beginner;;

public class EntityBegin {
	public static void mainRegisty(){
		registerEntity();
	}
	
	public static void registerEntity(){
		createEntity(EntityBeginMob.class, "Begin Mob", 0x0004FF, 0xFF001E);
	}
	
	public static void createEntity(Class entityClass, String entityName, int soildColor, int spotColor){
		int randmeId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randmeId, soildColor, spotColor);
	}
}
