
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.block.BrassburgatmBlock;
import se.brassburg.BrassburgMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BrassburgModBlocks {
	public static Block ATM;

	public static void load() {
		ATM = Registry.register(Registry.BLOCK, new ResourceLocation(BrassburgMod.MODID, "atm"), new BrassburgatmBlock());
	}

	public static void clientLoad() {
		BrassburgatmBlock.clientInit();
	}
}
