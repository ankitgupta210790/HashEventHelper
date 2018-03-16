package com.hash.helper;

import com.hash.network.ResponseHandler;
import com.hash.network.ResponseWrapper;
import com.hash.util.DataException;

public abstract class BaseEventHelper<T> implements ResponseWrapper<T> {
	public abstract boolean setReminder(String accessToken, T e, ResponseHandler handler) throws DataException;
}
