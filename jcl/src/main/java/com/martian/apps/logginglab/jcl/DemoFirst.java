package com.martian.apps.logginglab.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 1. No configuration output is system console and log leven is info by default. 
 * By default
 *    org.apache.commons.logging.impl.LogFactoryImpl
 *    org.apache.commons.logging.impl.Jdk14Logger, Jdk14Logger uses the Java 1.4+ java.util.logging classes.
 * 2. using commons-logging.properties configuration file
 * 
 */
public class DemoFirst {

	private final static Log LOG = LogFactory.getLog(DemoFirst.class);
	
	public static void main(String[] args){
        // basic config
        LOG.info("Current LogFactory = " + LogFactory.getFactory().getClass().getName());
        LOG.info("Current Logger = " + LOG.getClass().getName());
        
        // all levels log
		LOG.fatal("fatal message");
        LOG.error("error message");
        LOG.info("info message");
        LOG.debug("debug message");
        LOG.trace("trace message");
	}
	
}
