
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.BrassburgMod;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class BrassburgModPaintings {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "logo_painting"), new PaintingVariant(32, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "vonpainting_1"), new PaintingVariant(32, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "vonpainting_2"), new PaintingVariant(16, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "vonpainting_3"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "vonpainting_4"), new PaintingVariant(32, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "jayturnpainting_1"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "manstedodorpainting_1"), new PaintingVariant(16, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "manstedodorpainting_2"), new PaintingVariant(32, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "mrstepipainting_1"), new PaintingVariant(32, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "mrstepipainting_2"), new PaintingVariant(16, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "mrstepipainting_3"), new PaintingVariant(16, 16));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "vonpainting_5"), new PaintingVariant(32, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(BrassburgMod.MODID, "vonpainting_6"), new PaintingVariant(32, 32));
	}
}
