package ru.furnygo;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UnicodeNicknames implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("unicode-nicknames");
	@Override
	public void onInitialize() {
		LOGGER.info("Unicode Nicknames enabled");
	}
}