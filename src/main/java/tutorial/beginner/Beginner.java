package tutorial.beginner;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import tutorial.beginner.Modcst;
import tutorial.comm.ClientProxy;
import tutorial.comm.CommonProxy;

import tutorial.beginitem.BeginItem;
import tutorial.beginmob.EntityBegin;

@Mod(modid = Modcst.MODID, name = Modcst.NAME, version = Modcst.VERSION)
public class Beginner {
	@Instance("Generic")
	public static Beginner instance;
	
	@SidedProxy(clientSide = "tutorial.comm.ClientProxy",serverSide = "tutorial.comm.CommonProxy")
	public static CommonProxy proxy;
	
	public static Item beginItem;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		beginItem = new BeginItem().setUnlocalizedName("beginItem").setTextureName("beginner:beginItem");
		GameRegistry.registerItem(beginItem, beginItem.getUnlocalizedName());
		EntityBegin.mainRegisty();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}

}
