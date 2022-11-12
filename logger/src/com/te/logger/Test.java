package com.te.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
	
	public static final Logger LOGGER = Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) throws SecurityException, IOException {
		
		FileHandler fileHandler = new FileHandler("D:\\Logmyfiles.log");
		fileHandler.setLevel(Level.INFO);
		fileHandler.setFormatter(new MyFormatter());
		LOGGER.addHandler(fileHandler);
			
		LOGGER.severe("I am severe");
		LOGGER.warning("I am warning");
		LOGGER.info("I am info");
		LOGGER.config("I am config");
		LOGGER.fine("I am fine");
		LOGGER.finer("I am finer");
		LOGGER.finest("I am Finest");
		
		LOGGER.setLevel(Level.CONFIG);
//		ConsoleHandler consoleHandler = new ConsoleHandler();
//		consoleHandler.setLevel(Level.INFO);
//		LOGGER.addHandler(consoleHandler);
		
	
		
		
		
	}

}
