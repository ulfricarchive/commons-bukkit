package com.ulfric.commons.bukkit.server;

import java.util.logging.Level;

import org.bukkit.Bukkit;

public class ServerHelper {

	public static Void handleBreakingFailure(Throwable thrown) {
		Bukkit.getLogger().log(Level.SEVERE, "Caught breaking failure", thrown);
		Bukkit.shutdown();
		throw new RuntimeException(thrown);
	}

	private ServerHelper() {
	}

}
