package tools.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyFileReader {

	public static String dataSetup(String key) {

		Properties prop = new Properties();
		InputStream input = null;
		String propertyValue = "";

		try {
			input = new FileInputStream("src/main/resources/staging-env/environmentConstants.properties");
			prop.load(input);
			propertyValue = prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return propertyValue;
	}
}