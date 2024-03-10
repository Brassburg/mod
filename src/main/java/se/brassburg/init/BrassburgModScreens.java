
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package se.brassburg.init;

import se.brassburg.client.gui.ATMScreen;

import net.minecraft.client.gui.screens.MenuScreens;

public class BrassburgModScreens {
	public static void load() {
		MenuScreens.register(BrassburgModMenus.ATM, ATMScreen::new);
	}
}
