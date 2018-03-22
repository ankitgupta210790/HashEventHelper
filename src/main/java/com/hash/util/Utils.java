package com.hash.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	public static boolean isValidTime(String time) {
		Pattern p = Pattern.compile(
				"^(-?(?:[1-9][0-9]*)?[0-9]{4})-(1[0-2]|0[1-9])-(3[01]|0[1-9]|[12][0-9])T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|[+-](?:2[0-3]|[01][0-9]):[0-5][0-9])?$");
		Matcher m = p.matcher(time);
		return m.matches();

	}
}
