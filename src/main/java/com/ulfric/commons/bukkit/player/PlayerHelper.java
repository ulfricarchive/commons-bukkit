package com.ulfric.commons.bukkit.player;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import org.apache.commons.lang3.RandomUtils;

import java.util.Collection;
import java.util.Iterator;

public class PlayerHelper {

	public static boolean hasPlayedOnServer(OfflinePlayer player) {
		return player != null && (player.hasPlayedBefore() || player.isOnline());
	}

	@SuppressWarnings("deprecation")
	public static OfflinePlayer getOfflinePlayerByName(String name) {
		return Bukkit.getOfflinePlayer(name);
	}

	public static Player getRandomPlayer() {
		Collection<? extends Player> players = Bukkit.getOnlinePlayers();
		if (players.isEmpty()) {
			return null;
		}

		Iterator<? extends Player> iterator = players.iterator();
		int generated = RandomUtils.nextInt(0, players.size());
		for (int x = 0; x < generated; x++) {
			iterator.next();
		}
		return iterator.next();
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

	private PlayerHelper() {
	}

}
