package com.hash.helper;

import com.hash.util.CALENDAR_TYPE;

public class EventHelperFactory {

	@SuppressWarnings("unchecked")
	public static <T> BaseEventHelper<T> getEventHelper(CALENDAR_TYPE agent) {

		if (agent == null) {
			return null;
		}

		switch (agent) {
		case GOOGLE:
			return (BaseEventHelper<T>) new GoogleEventHandler();

		case MICROSOFT:
			return (BaseEventHelper<T>) new MicrosoftEventHandler();
		default:
			return null;
		}

	}

}
