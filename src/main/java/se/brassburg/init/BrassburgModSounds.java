
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class BrassburgModSounds {
	public static SoundEvent SWING = SoundEvent.createVariableRangeEvent(new ResourceLocation("brassburg", "swing"));
	public static SoundEvent CRISP = SoundEvent.createVariableRangeEvent(new ResourceLocation("brassburg", "crisp"));
	public static SoundEvent LOCOMETAL = SoundEvent.createVariableRangeEvent(new ResourceLocation("brassburg", "locometal"));
	public static SoundEvent YEARNING = SoundEvent.createVariableRangeEvent(new ResourceLocation("brassburg", "yearning"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("brassburg", "swing"), SWING);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("brassburg", "crisp"), CRISP);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("brassburg", "locometal"), LOCOMETAL);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("brassburg", "yearning"), YEARNING);
	}
}
