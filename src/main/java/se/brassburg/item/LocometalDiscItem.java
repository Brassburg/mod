
package se.brassburg.item;

import se.brassburg.init.BrassburgModTabs;
import se.brassburg.init.BrassburgModSounds;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class LocometalDiscItem extends RecordItem {
	public LocometalDiscItem() {
		super(0, BrassburgModSounds.LOCOMETAL, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 2100);
		ItemGroupEvents.modifyEntriesEvent(BrassburgModTabs.TAB_BRASSBURG).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
