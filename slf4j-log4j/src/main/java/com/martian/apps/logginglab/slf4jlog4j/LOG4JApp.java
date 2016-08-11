/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martian.apps.logginglab.slf4jlog4j;

import org.apache.log4j.Logger;

/**
 *
 * @author Neo WangBo
 */
public class LOG4JApp {
    
    private static final Logger LOGGER = Logger.getLogger(LOG4JApp.class);
    
    public void process(){
        LOGGER.info("LOG4JApp is running with LOG4J...");
        LOGGER.fatal("LOG4JApp[LOG4J] :: fatal message");
        LOGGER.error("LOG4JApp[LOG4J] :: error message");
        LOGGER.info("LOG4JApp[LOG4J] :: info message");
        LOGGER.debug("LOG4JApp[LOG4J] :: debug message");
        LOGGER.trace("LOG4JApp[LOG4J] :: trace message");
    }
}
