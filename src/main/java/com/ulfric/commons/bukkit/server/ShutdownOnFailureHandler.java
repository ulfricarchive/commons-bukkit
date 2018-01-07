package com.ulfric.commons.bukkit.server;

import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;

import com.ulfric.dragoon.extension.inject.Inject;

public class ShutdownOnFailureHandler implements Consumer<Throwable> {

	@Inject
	private Logger logger;

	@Override
	public void accept(Throwable thrown) {
		logger.log(Level.SEVERE, "Caught fatal error", thrown);
		Bukkit.shutdown();
	}

}
