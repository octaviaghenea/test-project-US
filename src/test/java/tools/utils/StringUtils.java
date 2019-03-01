package tools.utils;

public class StringUtils {
	
	/**
	 * Clean Numbers from String text.
	 * Ex: From - Cross Plaque +$25.27  -- TO - 25.27 --
	 * @param string
	 * @return
	 */
	public static String cleanStringToNumber(String string){
		return string = string.replaceAll("([^0-9.])", "");
	}
	
	/**
	 * Clean Numbers from String text and return 0 if no numbers found
	 * Ex: From - Cross Plaque +$25.27  -- TO - 25.27 --
	 * @param string
	 * @return
	 */
	
	public static String cleanStringToNumberOrZeroDefault(String string){
		String result = cleanStringToNumber(string);
		return result.contentEquals("") ? "0" : result;
	}
}
