
package se.brassburg.item;

import se.brassburg.init.BrassburgModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BrassburgcoinItem extends Item {
	public BrassburgcoinItem() {
		super(new Item.Properties().tab(BrassburgModTabs.TAB_BRASSBURG).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The currency of Brassburg"));
	}
}
