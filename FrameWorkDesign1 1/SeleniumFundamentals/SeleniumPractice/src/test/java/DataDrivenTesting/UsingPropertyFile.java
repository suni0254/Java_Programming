package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class UsingPropertyFile {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");

        Properties configProp = new Properties();

        configProp.load(file);

        String url = configProp.getProperty("appURL");
        String userName = configProp.getProperty("username");
        String passWord = configProp.getProperty("password");

        Set<String> keys = configProp.stringPropertyNames();
        Collection<Object> values = configProp.values();

        for(String key : keys) {
            System.out.println(key + " : " + configProp.getProperty(key));
        }
    }
}