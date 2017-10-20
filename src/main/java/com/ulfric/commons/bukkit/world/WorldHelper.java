package com.ulfric.commons.bukkit.world;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class WorldHelper {

	public static World getMainWorld() {
		List<World> worlds = Bukkit.getWorlds();

		if (worlds.isEmpty()) {
			throw new IllegalStateException("No worlds loaded");
		}

		return worlds.get(0);
	}

	private WorldHelper() {
	}

}
