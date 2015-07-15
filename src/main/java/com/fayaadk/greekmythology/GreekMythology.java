package com.fayaadk.greekmythology;

import com.fayaadk.greekmythology.items.ItemGoldCoin;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = GreekMythology.MODID, version = GreekMythology.VERSION)
public class GreekMythology {

	public static final String MODID = "greekmythology";
	public static final String VERSION = "0.0.1";

	public static Item GoldCoin;

	@Instance("greekmythology")
	public static GreekMythology instance;

	@EventHandler 
	public void preInit(FMLPreInitializationEvent event) {
		for(;;) {
			System.out.println(MODID);
		}
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

		GoldCoin = new ItemGoldCoin();

		GameRegistry.registerItem(GoldCoin, "goldcoin");

	}
}
