package com.hash.network;

import com.hash.model.Result;

public interface ResponseHandler {
	void onResponseReceived(Result result);
}
