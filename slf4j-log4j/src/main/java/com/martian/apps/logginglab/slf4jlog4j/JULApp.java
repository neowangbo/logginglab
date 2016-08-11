/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martian.apps.logginglab.slf4jlog4j;

import java.util.logging.Logger;

/**
 *
 * @author Neo WangBo
 */
public class JULApp {
    
    public static final Logger LOGGER = Logger.getLogger(JULApp.class.getName());
    
    public void process(){
        LOGGER.info("JULApp is running with Java Util Logging (JUL)...");
        LOGGER.finest("JULApp[Java Util Logging (JUL)] :: finest message");
        LOGGER.finer("JULApp[Java Util Logging (JUL)] :: finer message");
        LOGGER.fine("JULApp[Java Util Logging (JUL)] :: fine message");
        LOGGER.info("JULApp[Java Util Logging (JUL)] :: info message");
        LOGGER.warning("JULApp[Java Util Logging (JUL)] :: warning message");
        LOGGER.severe("JULApp[Java Util Logging (JUL)] :: severe message");
    }
}
