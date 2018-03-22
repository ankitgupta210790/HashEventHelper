package com.hash.network;

import com.hash.model.google_event.GoogleEvent;
import com.hash.model.microsoft_event.MicrosoftEvent;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ApiService {
	@POST("{calendarId}/events")
	Call<GoogleEvent> setReminder(@Path("calendarId") String calendarId, @Body GoogleEvent event,
			@Header("Authorization") String authorization, @Header("Content-type") String contentType);

	@POST
	Call<MicrosoftEvent> setReminder(@Url String url, @Body MicrosoftEvent event, @Header("Authorization") String authorization,
			@Header("Content-type") String contentType);
}
