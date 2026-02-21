package Config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    // Load properties file
    public static void loadConfig() {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Datta.p\\eclipse-workspace\\java\\src\\test\\java\\resources\\Testdata\\config.properties");
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get value
    public static String get(String key) {
        if (properties == null) {
            throw new RuntimeException("Config not loaded! Call ConfigReader.loadConfig() first.");
        }
        return properties.getProperty(key);
    }
}
