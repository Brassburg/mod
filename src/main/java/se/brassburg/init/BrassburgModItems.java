
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.item.BrassburgcoinItem;
import se.brassburg.BrassburgMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BrassburgModItems {
	public static Item COIN;
	public static Item ATM;

	public static void load() {
		COIN = Registry.register(Registry.ITEM, new ResourceLocation(BrassburgMod.MODID, "coin"), new BrassburgcoinItem());
		ATM = Registry.register(Registry.ITEM, new ResourceLocation(BrassburgMod.MODID, "atm"), new BlockItem(BrassburgModBlocks.ATM, new Item.Properties().tab(BrassburgModTabs.TAB_BRASSBURG)));
	}
}
