package ru.furnygo;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnicodeArguments implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("unicode-arguments");
	@Override
	public void onInitialize() {
		LOGGER.info("Unicode Arguments enabled");
	}
}