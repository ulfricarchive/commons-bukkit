package com.ulfric.commons.bukkit.event;

import org.bukkit.Bukkit;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

public class EventHelper {

	public static <T extends Event & Cancellable> boolean call(T event) {
		return called(event).isCancelled();
	}

	public static <T extends Event> T called(T event) {
		Bukkit.getPluginManager().callEvent(event);
		return event;
	}

	private EventHelper() {
	}

}
