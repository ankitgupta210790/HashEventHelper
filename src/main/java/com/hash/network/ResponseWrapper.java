package com.hash.network;

import com.hash.model.Result;
import com.hash.network.RetrofitClient.REQUEST_ID;

public interface ResponseWrapper<T> {
	void onSuccess(REQUEST_ID id, T t);
	void onFailure(REQUEST_ID id, Result t);
}
