/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martian.apps.logginglab.slf4jlog4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Neo WangBo
 */
public class Main {
    
    public static void main(String[] args){
        
       Logger logger = LoggerFactory.getLogger(Main.class);
       
       logger.info("Main is running with slf4j ...");
       
       logger.trace("Main[slf4j] :: trace message");
       logger.debug("Main[slf4j] :: debug message");
       logger.info("Main[slf4j] :: info message");
       logger.warn("Main[slf4j] :: warn message");
       logger.error("Main[slf4j] :: warn message");
       
       JCLApp jcl = new JCLApp();
       jcl.process();
       
       JULApp jul = new JULApp();
       jul.process();
       
       LOG4JApp log4j = new LOG4JApp();
       log4j.process();
        
    }
    
}
