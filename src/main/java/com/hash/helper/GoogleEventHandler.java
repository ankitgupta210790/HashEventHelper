package com.hash.helper;

import com.hash.model.Result;
import com.hash.model.google_event.Event;
import com.hash.network.RequestWrapper;
import com.hash.network.ResponseHandler;
import com.hash.network.RetrofitClient;
import com.hash.network.RetrofitClient.REQUEST_ID;
import com.hash.util.DataException;
import com.hash.util.RESULT_CODE;

class GoogleEventHandler extends BaseEventHelper<Event> {
	private ResponseHandler handler;

	@Override
	public boolean setReminder(String accessToken, Event e, ResponseHandler handler) throws DataException {
		if (accessToken == null || accessToken.isEmpty()) {
			throw new DataException("Please provide a valid access token");
		}
		if (isValid(e)) {
			this.handler = handler;
			RetrofitClient.getInstance().getApiServices()
					.setReminder(e.getCalenderId(), e, "Bearer " + accessToken, "application/json")
					.enqueue(new RequestWrapper<Event>(REQUEST_ID.SET_GOOGLE_REMINDER, this));
		}
		return false;
	}

	private boolean isValid(Event e) throws DataException {
		if (e == null) {
			throw new DataException("Event object cannot be null, Provide valid event object");
		}

		// if (e.getStart() == null ||
		// "".equals(Utils.isoToEpochMillis(e.getStart().getDateTime()))) {
		// throw new DataException("Please enter a valid start date");
		// }
		//
		// if (e.getEnd() == null ||
		// "".equals(Utils.isoToEpochMillis(e.getEnd().getDateTime()))) {
		// throw new DataException("Please enter a valid start date");
		// }

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

	public void onSuccess(REQUEST_ID id, Event t) {
		System.out.println(t.toString());
		if (handler != null) {
			handler.onResponseReceived(new Result(RESULT_CODE.SUCCESS, "Request has been successfully executed"));
		}		
	}


}
