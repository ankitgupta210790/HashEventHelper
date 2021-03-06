package com.hash.helper;

import com.hash.model.Result;
import com.hash.model.google_event.GoogleEvent;
import com.hash.network.RequestWrapper;
import com.hash.network.ResponseHandler;
import com.hash.network.RetrofitClient;
import com.hash.network.RetrofitClient.REQUEST_ID;
import com.hash.util.DataException;
import com.hash.util.RESULT_CODE;
import com.hash.util.Utils;

class GoogleEventHandler extends BaseEventHelper<GoogleEvent> {
	private ResponseHandler handler;

	@Override
	public boolean setReminder(String accessToken, GoogleEvent e, ResponseHandler handler) throws DataException {
		if (accessToken == null || accessToken.isEmpty()) {
			throw new DataException("Please provide a valid access token");
		}
		if (isValid(e)) {
			this.handler = handler;
			RetrofitClient.getInstance().getApiServices()
					.setReminder(e.getCalenderId(), e, "Bearer " + accessToken, "application/json")
					.enqueue(new RequestWrapper<GoogleEvent>(REQUEST_ID.SET_GOOGLE_REMINDER, this));
		}
		return false;
	}

	private boolean isValid(GoogleEvent e) throws DataException {
		if (e == null) {
			throw new DataException("Event object cannot be null, Provide valid event object");
		}
		if ((e.getStart() == null) || (e.getStart().getDateTime() == null || e.getStart().getDateTime().isEmpty())) {
			throw new DataException("Please provide the valid start time");
		}
		if ((e.getEnd() == null) || (e.getEnd().getDateTime() == null || e.getEnd().getDateTime().isEmpty())) {
			throw new DataException("Please provide the valid end time");
		}

		if (e.getStart().getTimeZone() == null || e.getStart().getTimeZone().isEmpty()) {
			throw new DataException("Please enter valid start time zone");
		}

		if (e.getEnd().getTimeZone() == null || e.getEnd().getTimeZone().isEmpty()) {
			throw new DataException("Please enter valid end time zone");
		}

		if (!Utils.isValidTime(e.getEnd().getDateTime())) {
			throw new DataException("Please enter end time in valid format(iso8601)");
		}
		if (!Utils.isValidTime(e.getEnd().getDateTime())) {
			throw new DataException("Please enter end time in valid format(iso8601)");
		}

		if (!Utils.isValidTime(e.getStart().getDateTime())) {
			throw new DataException("Please enter start time in valid format(iso8601)");
		}

		if (e.getCalenderId() == null || e.getCalenderId().isEmpty()) {
			throw new DataException("Please enter a valid calendar id. (Email of user)");
		}
		return true;

	}

	public void onFailure(REQUEST_ID id, Result result) {
		System.err.println(result);
		if (handler != null) {
			handler.onResponseReceived(result);
		}

	}

	public void onSuccess(REQUEST_ID id, GoogleEvent t) {
		System.out.println(t.toString());
		if (handler != null) {
			handler.onResponseReceived(new Result(RESULT_CODE.SUCCESS, "Request has been successfully executed"));
		}
	}

}
