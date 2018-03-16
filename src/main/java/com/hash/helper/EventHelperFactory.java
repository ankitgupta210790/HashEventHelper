package com.hash.helper;

import com.hash.util.VOICE_AGENT;

public class EventHelperFactory {

	@SuppressWarnings("unchecked")
	public static <T> BaseEventHelper<T> getEventHelper(VOICE_AGENT agent) {

		if (agent == null) {
			return null;
		}

		switch (agent) {
		case GOOGLE_ASSISTANT:
			return (BaseEventHelper<T>) new GoogleEventHandler();

		default:
			return null;
		}

	}

}
