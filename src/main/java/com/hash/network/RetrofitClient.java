package com.hash.network;

import java.lang.reflect.Modifier;

import com.google.gson.GsonBuilder;
import com.hash.util.Constants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

	public enum REQUEST_ID {
		SET_GOOGLE_REMINDER, SET_MICROSOFT_EVENT
	}

	private static RetrofitClient mInstance;
	ApiService apiServices;

	private RetrofitClient() {

		HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
		interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(interceptor).build();
		Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.GOOGLE_CALENDAR_API_BASE_URL).client(client)
				.addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
						.excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
						/* .serializeNulls() */
						.create()))
				.build();

		apiServices = retrofit.create(ApiService.class);
	}

	public static synchronized RetrofitClient getInstance() {
		if (mInstance == null)
			mInstance = new RetrofitClient();
		return mInstance;
	}

	public ApiService getApiServices() {
		return apiServices;
	}
}
