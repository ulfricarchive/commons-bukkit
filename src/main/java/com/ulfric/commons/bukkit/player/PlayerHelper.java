package com.ulfric.commons.bukkit.player;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.ulfric.commons.value.UniqueIdHelper;

public class PlayerHelper {

	public static boolean hasPlayedOnServer(OfflinePlayer player) {
		return player != null && (player.hasPlayedBefore() || player.isOnline());
	}

	@SuppressWarnings("deprecation")
	public static OfflinePlayer getOfflinePlayerByName(String name) {
		return Bukkit.getOfflinePlayer(name);
	}

	public static UUID getCachedUniqueId(String name) {
		UUID uniqueId = UniqueIdHelper.parseUniqueId(name);
		if (uniqueId != null) {
			return uniqueId;
		}

		Player online = Bukkit.getPlayerExact(name);
		if (online != null) {
			return online.getUniqueId();
		}

		return Bukkit.getCachedUniqueId(name);
	}

	public static boolean isAskingForSelf(String argument) {
		argument = argument.toLowerCase();

		return argument.equals("me") ||
				argument.equals("myself") ||
				argument.equals("self") ||
				isVanillaSelfSelector(argument);
	}

	private static boolean isVanillaSelfSelector(String argument) {
		return argument.equals("@p") || argument.equals("@e");
	}

	public static String debugName(Player player) {
		return String.format("%s (%s)", player.getName(), player.getUniqueId().toString());
	}

	private PlayerHelper() {
	}

}
