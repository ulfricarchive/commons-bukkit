package com.ulfric.commons.spigot.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemStackHelper {

	public static boolean matches(ItemStack item, Material type) {
		if (item == null) {
			return type == null || type == Material.AIR;
		}

		if (type == null) {
			return item.getType() == Material.AIR;
		}

		return item.getType() == type;
	}

	private ItemStackHelper() {
	}

}
