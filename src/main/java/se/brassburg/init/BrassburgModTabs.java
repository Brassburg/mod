
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.BrassburgMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class BrassburgModTabs {
	public static ResourceKey<CreativeModeTab> TAB_BRASSBURG = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(BrassburgMod.MODID, "brassburg"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_BRASSBURG, FabricItemGroup.builder().title(Component.translatable("item_group." + BrassburgMod.MODID + ".brassburg")).icon(() -> new ItemStack(BrassburgModItems.BRASS_COIN)).build());
	}
}
