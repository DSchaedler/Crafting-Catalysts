package com.dschaedler.craftingcatalysts;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = CraftingCatalysts.MODID, name = CraftingCatalysts.NAME, version = CraftingCatalysts.VERSION, acceptedMinecraftVersions = CraftingCatalysts.MC_VERSION)
public class CraftingCatalysts {
	
	public static final String MODID = "craftingcatalysts";
	public static final String NAME = "Crafting Catalysts";
	public static final String VERSION = "1.1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final Logger LOGGER = LogManager.getLogger(CraftingCatalysts.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Initializing. Here's to useless items!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
