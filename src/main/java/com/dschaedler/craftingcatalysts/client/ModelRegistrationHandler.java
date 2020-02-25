package com.dschaedler.craftingcatalysts.client;

import com.dschaedler.craftingcatalysts.CraftingCatalysts;
import com.dschaedler.craftingcatalysts.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = CraftingCatalysts.MODID)
public class ModelRegistrationHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.TIER_ONE_CATALYST, 0);
		registerModel(ModItems.TIER_TWO_CATALYST, 0);
		registerModel(ModItems.TIER_THREE_CATALYST, 0);
		registerModel(ModItems.TIER_FOUR_CATALYST, 0);
		registerModel(ModItems.TIER_FIVE_CATALYST, 0);
		registerModel(ModItems.TIER_SIX_CATALYST, 0);
		registerModel(ModItems.TIER_SEVEN_CATALYST, 0);
		registerModel(ModItems.TIER_EIGHT_CATALYST, 0);
		registerModel(ModItems.TIER_NINE_CATALYST, 0);
		registerModel(ModItems.TIER_TEN_CATALYST, 0);
	}
	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
