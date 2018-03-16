package com.hash.util;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Utils {

	
	public static String isoToEpochMillis(String dateTimeString) {
	    try {
	        OffsetDateTime dateTime = OffsetDateTime.parse(dateTimeString,
	                DateTimeFormatter.ofPattern("uuuuMMdd'T'HHmmssX"));
	        if (! dateTime.getOffset().equals(ZoneOffset.UTC)) {
	            throw new IllegalArgumentException("Offset is not Z");
	        }
	        return String.valueOf(dateTime.toInstant().toEpochMilli());
	    } catch (DateTimeException dte) {
	        throw new IllegalArgumentException("String is not in format uuuuMMddTHHmmssZ",
	                                           dte);
	    }
	}
}

