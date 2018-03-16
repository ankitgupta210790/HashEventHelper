package com.hash.network;


import com.hash.model.google_event.Event;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
	@POST("{calendarId}/events")
	Call<Event> setReminder(@Path("calendarId") String calendarId, @Body Event event,
			@Header("Authorization") String authorization, @Header("Content-type") String contentType);
}
