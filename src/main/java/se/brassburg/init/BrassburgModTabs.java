
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class BrassburgModTabs {
	public static CreativeModeTab TAB_BRASSBURG;

	public static void load() {
		TAB_BRASSBURG = FabricItemGroupBuilder.create(new ResourceLocation("brassburg", "brassburg")).icon(() -> new ItemStack(BrassburgModItems.COIN)).build();
	}
}
