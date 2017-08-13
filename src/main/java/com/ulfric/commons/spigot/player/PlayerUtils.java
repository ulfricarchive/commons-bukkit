package com.ulfric.commons.spigot.player;

import org.bukkit.OfflinePlayer;

public class PlayerUtils {

	public static boolean hasPlayedOnServer(OfflinePlayer player) {
		return player.hasPlayedBefore() || player.isOnline();
	}

	private PlayerUtils() {
	}

}
