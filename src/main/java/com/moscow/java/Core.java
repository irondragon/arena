package com.moscow.java;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by messi on 23.01.2015.
 */

public class Core implements Comparable{

    final static Logger logger = Logger.getLogger(Core.class.getName());

    private String name;

    public static String properties="app.properties";

    public Core() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Core(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Core core = new Core();
        Properties props = new Properties();
        InputStream resourceStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(properties);
        try {
            props.load(resourceStream);
            resourceStream.close();
        } catch (IOException e) {
            logger.error(e);
        } finally {

        }
        core.setName(props.getProperty("value"));
        logger.info(core.getName());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Core coreFromSpring = (Core) context.getBean("core");
        logger.info(coreFromSpring.getName());
    }

}
