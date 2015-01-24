package main.java.com.moscow.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by messi on 23.01.2015.
 */

public class Core {

    private String name;

    public static String properties="app.properties";

    public Core() {
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
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        core.setName(props.getProperty("value"));
        System.out.print(core.getName());
    }

}
