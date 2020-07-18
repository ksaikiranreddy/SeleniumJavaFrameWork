package com.application.utilities.filehandlingutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ReadProperties {

    FileInputStream file;
    FileOutputStream output;
    Properties prop;

    public ReadProperties(String filePath) {
        try {
            file = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(file);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public String getProperty(String property) {
        return prop.getProperty(property);
    }

    public void setProperty(String property, String value) {
        prop.setProperty(property, value);
    }
}
