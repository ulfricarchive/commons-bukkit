package com.ulfric.commons.spigot.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;

import java.util.UUID;

public class CommandSenderHelper {

	public static UUID getUniqueId(CommandSender sender) {
		if (sender instanceof Entity) {
			return ((Entity) sender).getUniqueId();
		}

		return null;
	}

	private CommandSenderHelper() {
	}

}