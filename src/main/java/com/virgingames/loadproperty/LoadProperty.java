package com.virgingames.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by JANVI on 23/11/2019.
 */
public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    String projectPath = System.getProperty("user.dir");    //created universal path

    public String getProperty(String key) {
        prop = new Properties();                                     //Created a Objects
        try {
            input = new FileInputStream(projectPath +"\\src\\test\\java\\com\\virgingames\\resources\\propertiesfile\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);       //This will return the value from config file
    }
}