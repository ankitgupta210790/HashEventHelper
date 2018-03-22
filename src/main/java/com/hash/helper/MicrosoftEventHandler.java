package com.hash.helper;

import com.hash.model.Result;
import com.hash.model.microsoft_event.MicrosoftEvent;
import com.hash.network.RequestWrapper;
import com.hash.network.ResponseHandler;
import com.hash.network.RetrofitClient;
import com.hash.network.RetrofitClient.REQUEST_ID;
import com.hash.util.Constants;
import com.hash.util.DataException;
import com.hash.util.RESULT_CODE;
import com.hash.util.Utils;

public class MicrosoftEventHandler extends BaseEventHelper<MicrosoftEvent> {

	private ResponseHandler handler;

	@Override
	public boolean setReminder(String accessToken, MicrosoftEvent e, ResponseHandler handler) throws DataException {

		if (accessToken == null || accessToken.isEmpty()) {
			throw new DataException("Please provide a valid access token");
		}

		if (isValid(e)) {
			this.handler = handler;
			RetrofitClient.getInstance().getApiServices()
					.setReminder(Constants.MICROSOFT_CALENDAR_API_URL, e, Constants.BEARER_AUTH_TYPE + accessToken,
							Constants.REQUEST_HEADER_CONTENT_TYPE_JSON)
					.enqueue(new RequestWrapper<MicrosoftEvent>(REQUEST_ID.SET_MICROSOFT_EVENT, this));
		}
		return false;
	}

	private boolean isValid(MicrosoftEvent e) throws DataException {
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

		if (!Utils.isValidTime(e.getStart().getDateTime())) {
			throw new DataException("Please enter start time in valid format(iso8601)");
		}

		return true;
	}

	public void onFailure(REQUEST_ID id, Result result) {
		System.err.println(result);
		if (handler != null) {
			handler.onResponseReceived(result);
		}

	}

	public void onSuccess(REQUEST_ID id, MicrosoftEvent t) {
		System.out.println(t.toString());
		if (handler != null) {
			handler.onResponseReceived(new Result(RESULT_CODE.SUCCESS, "Request has been successfully executed"));
		}
	}
}
