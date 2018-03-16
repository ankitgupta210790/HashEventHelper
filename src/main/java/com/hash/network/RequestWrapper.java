package com.hash.network;

import com.hash.helper.BaseEventHelper;
import com.hash.model.Result;
import com.hash.network.RetrofitClient.REQUEST_ID;
import com.hash.util.RESULT_CODE;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestWrapper<T> implements Callback<T> {

	private REQUEST_ID requestId;
	private BaseEventHelper<T> baseEventHelper;

	public RequestWrapper(REQUEST_ID requestId, BaseEventHelper<T> baseEventHelper) {
		super();
		this.requestId = requestId;
		this.baseEventHelper = baseEventHelper;
	}

	public void onFailure(Call<T> call, Throwable arg1) {
		if (baseEventHelper != null) {
			baseEventHelper.onFailure(requestId, new Result(RESULT_CODE.UNKNOWN_ERROR, arg1.getMessage()));
		}
	}

	public void onResponse(Call<T> arg0, Response<T> arg1) {
		if (baseEventHelper != null && arg1 != null) {
			if (arg1.body() != null) {
				baseEventHelper.onSuccess(requestId, arg1.body());
			} else {
				if (arg1.code() == 401) {
					baseEventHelper.onFailure(requestId,
							new Result(RESULT_CODE.UNAUTHORIZED_ACCESS, "Error code 401 Unauthorized access. Please try with the new access token"));
				} else {
					baseEventHelper.onFailure(requestId, new Result(RESULT_CODE.UNKNOWN_ERROR,"Error code " + arg1.code() + " Error occurred"));
				}
			}
		}
	}

}
