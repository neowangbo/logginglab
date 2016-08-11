/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martian.apps.logginglab.slf4jlog4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Neo WangBo
 */
public class JCLApp {
    
    private static final Log LOG = LogFactory.getLog(JCLApp.class);
    
    public void process(){
        LOG.info("JCLApp is running with Apache Commons Logging (JCL) ...");
        LOG.trace("JCLApp[Apache Commons Logging (JCL)] :: trace message");
        LOG.debug("JCLApp[Apache Commons Logging (JCL)] :: debug message");
        LOG.info("JCLApp[Apache Commons Logging (JCL)] :: info message");
        LOG.error("JCLApp[Apache Commons Logging (JCL)] :: error message");
        LOG.fatal("JCLApp[Apache Commons Logging (JCL)] :: fatal message");
    }
}
