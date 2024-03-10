/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package se.brassburg;

import se.brassburg.init.BrassburgModTabs;
import se.brassburg.init.BrassburgModProcedures;
import se.brassburg.init.BrassburgModPaintings;
import se.brassburg.init.BrassburgModMenus;
import se.brassburg.init.BrassburgModItems;
import se.brassburg.init.BrassburgModBlocks;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

public class BrassburgMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "brassburg";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing BrassburgMod");

		BrassburgModTabs.load();

		BrassburgModBlocks.load();
		BrassburgModItems.load();

		BrassburgModPaintings.load();
		BrassburgModProcedures.load();

		BrassburgModMenus.load();

	}
}
