package com.ulfric.commons.bukkit.player;

import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractEventHelper {

	public static boolean isClickBlock(PlayerInteractEvent event) {
		if (event == null) {
			return false;
		}

		Action action = event.getAction();
		return action == Action.LEFT_CLICK_BLOCK || action == Action.RIGHT_CLICK_BLOCK;
	}

	public static boolean isLeftClickBlock(PlayerInteractEvent event) {
		if (event == null) {
			return false;
		}

		return event.getAction() == Action.LEFT_CLICK_BLOCK;
	}

	private InteractEventHelper() {
	}

}
