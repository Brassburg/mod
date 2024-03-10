
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.world.inventory.ATMMenu;
import se.brassburg.BrassburgMod;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class BrassburgModMenus {
	public static MenuType<ATMMenu> ATM;

	public static void load() {
		ATM = Registry.register(Registry.MENU, new ResourceLocation(BrassburgMod.MODID, "atm"), new ExtendedScreenHandlerType<>(ATMMenu::new));
		ATMMenu.screenInit();
	}
}
