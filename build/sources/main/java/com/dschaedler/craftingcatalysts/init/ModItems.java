package com.dschaedler.craftingcatalysts.init;

import com.dschaedler.craftingcatalysts.CraftingCatalysts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(CraftingCatalysts.MODID)
public class ModItems {
	
	public static final Item TIER_ONE_CATALYST = null;
	public static final Item TIER_TWO_CATALYST = null;
	public static final Item TIER_THREE_CATALYST = null;
	public static final Item TIER_FOUR_CATALYST = null;
	public static final Item TIER_FIVE_CATALYST = null;
	public static final Item TIER_SIX_CATALYST = null;
	public static final Item TIER_SEVEN_CATALYST = null;
	public static final Item TIER_EIGHT_CATALYST = null;
	public static final Item TIER_NINE_CATALYST = null;
	public static final Item TIER_TEN_CATALYST = null;
	
	@EventBusSubscriber(modid = CraftingCatalysts.MODID)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void RegisterItems(Register<Item> event) {
			final Item[] items = {
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_one_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_one_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_two_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_two_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_three_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_three_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_four_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_four_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_five_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_five_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_six_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_six_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_seven_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_seven_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_eight_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_eight_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_nine_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_nine_catalyst").setCreativeTab(CreativeTabs.MISC),
					new Item().setRegistryName(CraftingCatalysts.MODID, "tier_ten_catalyst").setTranslationKey(CraftingCatalysts.MODID + "." + "tier_ten_catalyst").setCreativeTab(CreativeTabs.MISC)
			};
			
			event.getRegistry().registerAll(items);
		}
	}
}
