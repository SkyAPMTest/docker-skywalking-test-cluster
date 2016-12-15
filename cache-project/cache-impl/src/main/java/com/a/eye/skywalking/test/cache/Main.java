package com.a.eye.skywalking.test.cache;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xin on 2016/12/13.
 */
public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring/applicationContext.xml");
        try {
            applicationContext.start();
            logger.info("cache service started.");
            Thread.currentThread().join();
        } catch (Throwable e) {
            logger.error("Failed to start service", e);
            System.exit(-1);
        } finally {
        }
    }
}
