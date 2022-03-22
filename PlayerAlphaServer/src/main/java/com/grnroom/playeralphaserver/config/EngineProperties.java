package com.grnroom.playeralphaserver.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EngineProperties {

    private static final String PROPERTIES_PATH = "./application.properties";
    private static Properties props;

    public static String getString (String key) {
        load();
        return props.getProperty (key);
    }

        private static void load () {
        if (props != null)
            return;
        try {
            props = new Properties();
            props.load (new FileInputStream (PROPERTIES_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
