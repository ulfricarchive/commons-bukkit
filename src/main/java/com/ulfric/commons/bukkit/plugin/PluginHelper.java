package com.ulfric.commons.bukkit.plugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginHelper {

	public static Plugin getProvidingPlugin(Object object) {
		if (object == null) {
			return null;
		}

		if (object instanceof Plugin) {
			return (Plugin) object;
		}

		Class<?> type;
		if (object instanceof Class) { // TODO handle generic type
			type = (Class<?>) object;
		} else {
			type = object.getClass();
		}

		return JavaPlugin.getProvidingPlugin(type);
	}

	private PluginHelper() {
	}

}
