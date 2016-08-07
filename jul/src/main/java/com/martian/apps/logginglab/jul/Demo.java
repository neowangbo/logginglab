/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martian.apps.logginglab.jul;

import java.util.logging.Logger;



/**
 * java -cp jul.jar -Djava.util.logging.config.file=/Users/wangbo/DevHome/Projects/logginglab/jul/target/classes/logging.properties com.martian.apps.logginglab.jul.Demo
 * 
 * @author wangbo
 */
public class Demo {
    
    private static final Logger LOGGER = Logger.getLogger(Demo.class.getName());
    
    public static void main(String[] args){
        LOGGER.info("Current Logger = " + LOGGER.getClass().getName());
        
        LOGGER.finest("finest log");
        LOGGER.finer("finer log");
        LOGGER.fine("fine log");
        LOGGER.config("config log");
        LOGGER.info("info log");
        LOGGER.warning("warning log");
        LOGGER.severe("severe log");
    }
    
}
