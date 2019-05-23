package tools.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyFileReader {

	public static String dataSetup(String key) {

		String userName = "";
		String password = "";
		String id = "";

		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("src/test/resources/properties/login.properties");
			prop.load(input);

			userName = prop.getProperty("username");
			password = prop.getProperty("password");
			id = prop.getProperty("id");

			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));

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
		return id;
	}
}