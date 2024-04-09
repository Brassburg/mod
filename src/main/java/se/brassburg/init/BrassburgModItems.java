/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.item.ZincCoinItem;
import se.brassburg.item.SteampunkShovelItem;
import se.brassburg.item.SteampunkAxeItem;
import se.brassburg.item.CopperCoinItem;
import se.brassburg.item.BrassCoinItem;
import se.brassburg.BrassburgMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class BrassburgModItems {
	public static Item ATM;
	public static Item BRASS_COIN;
	public static Item COPPER_COIN;
	public static Item ZINC_COIN;
	public static Item STEAMPUNK_SHOVEL;
	public static Item STEAMPUNK_AXE;

	public static void load() {
		ATM = register("atm", new BlockItem(BrassburgModBlocks.ATM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(BrassburgModTabs.TAB_BRASSBURG).register(content -> content.accept(ATM));
		BRASS_COIN = register("brass_coin", new BrassCoinItem());
		COPPER_COIN = register("copper_coin", new CopperCoinItem());
		ZINC_COIN = register("zinc_coin", new ZincCoinItem());
		STEAMPUNK_SHOVEL = register("steampunk_shovel", new SteampunkShovelItem());
		STEAMPUNK_AXE = register("steampunk_axe", new SteampunkAxeItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BrassburgMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
