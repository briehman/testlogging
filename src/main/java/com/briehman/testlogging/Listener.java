package com.briehman.testlogging;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Listener implements ServletContextListener {

    private static final Logger LOG = LoggerFactory.getLogger(Listener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.println("Listener initialized - stderr");
        System.err.println("Listener initialized - stdout");
        LOG.error("Listener initialized - log error");
        LOG.warn("Listener initialized - log warn");
        LOG.debug("Listener initialized - log debug");
        LOG.trace("Listener initialized - log trace");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
