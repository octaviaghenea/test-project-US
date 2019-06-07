package tools.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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

	public static void savePropertyInPropertyFile(String propertyfile, String propertyName, String propertyValue)
			throws IOException {
		FileInputStream in = new FileInputStream("src/main/resources/staging-env/" + propertyfile);
		Properties props = new Properties();
		props.load(in);
		in.close();

		FileOutputStream out = new FileOutputStream("src/main/resources/staging-env/" + propertyfile);
		props.setProperty(propertyName, propertyValue);
		props.store(out, null);
		out.close();
	}

	public static void savePropertiesInPropertyFile(String propertyfile, Map<String, String> properties)
			throws IOException {
		FileInputStream in = new FileInputStream("src/main/resources/staging-env/" + propertyfile);
		Properties props = new Properties();
		props.load(in);
		in.close();

		FileOutputStream out = new FileOutputStream("src/main/resources/staging-env/" + propertyfile);
		for (String key : properties.keySet()) {
			props.setProperty(key, properties.get(key));
		}
		props.store(out, null);
		out.close();
	}

	public static void main(String[] args) throws IOException {
		PropertyFileReader.savePropertyInPropertyFile("octa.properties", "email", "ciocanel");
		 Map<String, String> map = new HashMap<String, String>();
		    map.put("key1", "value1");
		    map.put("key2", "value2");
		    map.put("key3", "value3");
		PropertyFileReader.savePropertiesInPropertyFile("octa.properties", map);
	}
}