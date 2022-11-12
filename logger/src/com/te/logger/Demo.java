package com.te.logger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	public static final Logger logger = LogManager.getLogger(Demo.class);

	public static void main(String[] args) {
		
		logger.fatal("I am fatal");
		logger.warn("I am warn");
        logger.info("I am Info");
        logger.error("I am error");
        logger.debug("I am debug");
        logger.trace("I am trace");
		
	}

}
