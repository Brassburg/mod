package se.brassburg;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import se.brassburg.init.BrassburgModItems;

public class BalanceTransferManager {

  private static final EntityDataAccessor<Integer> BALANCE_ID = SynchedEntityData.defineId(Player.class, EntityDataSerializers.INT);

  public void depositCoins(Player player, ItemStack stack) {
		if (stack.getItem() != BrassburgModItems.COIN) {
			return;
		}

		Integer quantity = stack.getCount();
		Integer currentBalance = getBalance(player);

		if (quantity > 0) {
			addBalance(player, quantity);
			assert getBalance(player) == (currentBalance + quantity);

			player.getInventory().removeItem(stack);
		}
		
	}

	public void withdrawCoins(Player player, Integer amount) {
		Integer currentBalance = getBalance(player);

		if (amount > 0 && currentBalance >= amount) {
			addBalance(player, -amount);
			assert getBalance(player) == (currentBalance - amount);

			player.getInventory().add(new ItemStack(BrassburgModItems.COIN, amount));
		}
	}

	public Integer getBalance(Player player) {
		return player.getEntityData().get(BALANCE_ID);
	}

	private void addBalance(Player player, Integer amount) {
		SynchedEntityData data = player.getEntityData();
		data.set(BALANCE_ID, getBalance(player) + amount);
	}
}
