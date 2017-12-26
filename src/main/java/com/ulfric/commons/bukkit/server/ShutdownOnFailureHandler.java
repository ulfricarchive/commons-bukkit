package com.ulfric.commons.bukkit.server;

import java.util.function.Consumer;
import java.util.logging.Level;

import org.bukkit.Bukkit;

import com.ulfric.dragoon.extension.inject.Inject;
import com.ulfric.dragoon.logging.Log;

public class ShutdownOnFailureHandler implements Consumer<Throwable> {

	@Inject
	private Log logger;

	@Override
	public void accept(Throwable thrown) {
		logger.log(Level.SEVERE, "Caught fatal error", thrown);
		Bukkit.shutdown();
	}

}
