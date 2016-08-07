package com.martian.apps.logginglab.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 1. No configuration output is system console and log leven is info by default. 
 * By default
 *    org.apache.commons.logging.impl.LogFactoryImpl
 *    org.apache.commons.logging.impl.Jdk14Logger, Jdk14Logger uses the Java 1.4+ java.util.logging classes.
 * 
 *    ($ which java to get command location)
 *    default configuration file is /Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/jre/lib/logging.proerties
 * 
 * 2. commons-logging + jul (java util logging)
 *    java -cp jcl.jar:/Users/wangbo/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar \
 *         -Djava.util.logging.config.file=/Users/wangbo/DevHome/Projects/logginglab/jcl/target/classes/logging.properties \
 *         com.martian.apps.logginglab.jcl.Demo
 * 3. commons-logging + log4j
 *    a) using configuration file in classpath (log4j find it by itself)
 *    java -cp jcl.jar:/Users/wangbo/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/wangbo/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar com.martian.apps.logginglab.jcl.Demo
 *    java -cp jcl.jar:/Users/wangbo/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/wangbo/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar -Dlog4j.configuration=log4j.properties com.martian.apps.logginglab.jcl.Demo
 *    
 *    b) specify configuration file location
 *    java -cp jcl.jar:/Users/wangbo/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/wangbo/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar -Dlog4j.configuration=file:/Users/wangbo/DevHome/Projects/logginglab/jcl/target/classes/log4j-external.properties com.martian.apps.logginglab.jcl.Demo
 * 
 */
public class Demo {

	private final static Log LOG = LogFactory.getLog(Demo.class);
	
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