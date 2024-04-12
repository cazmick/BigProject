package org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

    File file = new File("./test/resources/Config_Live.properties") ;
    public void propertyReader() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(file);

        Properties properties = new Properties();


    }

}
