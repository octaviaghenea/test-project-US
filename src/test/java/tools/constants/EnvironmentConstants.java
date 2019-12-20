package tools.constants;

import tools.utils.PropertyFileReader;

public class EnvironmentConstants {

	public static final String REGULAR_USER = PropertyFileReader.dataSetup("REGULAR_USER");
	public static final String PASSWORD = PropertyFileReader.dataSetup("PASSWORD");
	
	public static final String ADMIN_USER_OSC = PropertyFileReader.dataSetup("ADMIN_USER_OSC");
	public static final String PASSWORD_OSC = PropertyFileReader.dataSetup("PASSWORD_OSC");
	
}
