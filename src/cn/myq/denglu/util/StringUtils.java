package cn.myq.denglu.util;

public class StringUtils {

	public static String initcap(String str) {
		if (str == null) { 
			return null;
		}
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
