
package com.hash.model.microsoft_event;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hash.model.Event;

public class MicrosoftEvent extends Event {

	public MicrosoftEvent(String calenderId) {
		super(calenderId);
		if (calenderId != null && calenderId.isEmpty()) {
			super.calenderId = null;
		}
	}

	@SerializedName("@odata.context")
	@Expose
	private String odataContext;
	@SerializedName("@odata.id")
	@Expose
	private String odataId;
	@SerializedName("@odata.etag")
	@Expose
	private String odataEtag;
	@SerializedName("Id")
	@Expose
	private String id;
	@SerializedName("CreatedDateTime")
	@Expose
	private String createdDateTime;
	@SerializedName("LastModifiedDateTime")
	@Expose
	private String lastModifiedDateTime;
	@SerializedName("ChangeKey")
	@Expose
	private String changeKey;
	@SerializedName("Categories")
	@Expose
	private List<Object> categories = null;
	@SerializedName("OriginalStartTimeZone")
	@Expose
	private String originalStartTimeZone;
	@SerializedName("OriginalEndTimeZone")
	@Expose
	private String originalEndTimeZone;
	@SerializedName("iCalUId")
	@Expose
	private String iCalUId;
	@SerializedName("ReminderMinutesBeforeStart")
	@Expose
	private Integer reminderMinutesBeforeStart;
	@SerializedName("IsReminderOn")
	@Expose
	private Boolean isReminderOn;
	@SerializedName("HasAttachments")
	@Expose
	private Boolean hasAttachments;
	@SerializedName("Subject")
	@Expose
	private String subject;
	@SerializedName("BodyPreview")
	@Expose
	private String bodyPreview;
	@SerializedName("Importance")
	@Expose
	private String importance;
	@SerializedName("Sensitivity")
	@Expose
	private String sensitivity;
	@SerializedName("IsAllDay")
	@Expose
	private Boolean isAllDay;
	@SerializedName("IsCancelled")
	@Expose
	private Boolean isCancelled;
	@SerializedName("IsOrganizer")
	@Expose
	private Boolean isOrganizer;
	@SerializedName("ResponseRequested")
	@Expose
	private Boolean responseRequested;
	@SerializedName("SeriesMasterId")
	@Expose
	private Object seriesMasterId;
	@SerializedName("ShowAs")
	@Expose
	private String showAs;
	@SerializedName("Type")
	@Expose
	private String type;
	@SerializedName("WebLink")
	@Expose
	private String webLink;
	@SerializedName("OnlineMeetingUrl")
	@Expose
	private Object onlineMeetingUrl;
	@SerializedName("ResponseStatus")
	@Expose
	private ResponseStatus responseStatus;
	@SerializedName("Body")
	@Expose
	private Body body;
	@SerializedName("Start")
	@Expose
	private Start start;
	@SerializedName("End")
	@Expose
	private End end;
	@SerializedName("Location")
	@Expose
	private Location location;
	@SerializedName("Locations")
	@Expose
	private List<Object> locations = null;
	@SerializedName("Recurrence")
	@Expose
	private Object recurrence;
	@SerializedName("Attendees")
	@Expose
	private List<Object> attendees = null;
	@SerializedName("Organizer")
	@Expose
	private Organizer organizer;

	public String getOdataContext() {
		return odataContext;
	}

	public void setOdataContext(String odataContext) {
		this.odataContext = odataContext;
	}

	public String getOdataId() {
		return odataId;
	}

	public void setOdataId(String odataId) {
		this.odataId = odataId;
	}

	public String getOdataEtag() {
		return odataEtag;
	}

	public void setOdataEtag(String odataEtag) {
		this.odataEtag = odataEtag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getChangeKey() {
		return changeKey;
	}

	public void setChangeKey(String changeKey) {
		this.changeKey = changeKey;
	}

	public List<Object> getCategories() {
		return categories;
	}

	public void setCategories(List<Object> categories) {
		this.categories = categories;
	}

	public String getOriginalStartTimeZone() {
		return originalStartTimeZone;
	}

	public void setOriginalStartTimeZone(String originalStartTimeZone) {
		this.originalStartTimeZone = originalStartTimeZone;
	}

	public String getOriginalEndTimeZone() {
		return originalEndTimeZone;
	}

	public void setOriginalEndTimeZone(String originalEndTimeZone) {
		this.originalEndTimeZone = originalEndTimeZone;
	}

	public String getICalUId() {
		return iCalUId;
	}

	public void setICalUId(String iCalUId) {
		this.iCalUId = iCalUId;
	}

	public Integer getReminderMinutesBeforeStart() {
		return reminderMinutesBeforeStart;
	}

	public void setReminderMinutesBeforeStart(Integer reminderMinutesBeforeStart) {
		this.reminderMinutesBeforeStart = reminderMinutesBeforeStart;
	}

	public Boolean getIsReminderOn() {
		return isReminderOn;
	}

	public void setIsReminderOn(Boolean isReminderOn) {
		this.isReminderOn = isReminderOn;
	}

	public Boolean getHasAttachments() {
		return hasAttachments;
	}

	public void setHasAttachments(Boolean hasAttachments) {
		this.hasAttachments = hasAttachments;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyPreview() {
		return bodyPreview;
	}

	public void setBodyPreview(String bodyPreview) {
		this.bodyPreview = bodyPreview;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}

	public Boolean getIsAllDay() {
		return isAllDay;
	}

	public void setIsAllDay(Boolean isAllDay) {
		this.isAllDay = isAllDay;
	}

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public Boolean getIsOrganizer() {
		return isOrganizer;
	}

	public void setIsOrganizer(Boolean isOrganizer) {
		this.isOrganizer = isOrganizer;
	}

	public Boolean getResponseRequested() {
		return responseRequested;
	}

	public void setResponseRequested(Boolean responseRequested) {
		this.responseRequested = responseRequested;
	}

	public Object getSeriesMasterId() {
		return seriesMasterId;
	}

	public void setSeriesMasterId(Object seriesMasterId) {
		this.seriesMasterId = seriesMasterId;
	}

	public String getShowAs() {
		return showAs;
	}

	public void setShowAs(String showAs) {
		this.showAs = showAs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	public Object getOnlineMeetingUrl() {
		return onlineMeetingUrl;
	}

	public void setOnlineMeetingUrl(Object onlineMeetingUrl) {
		this.onlineMeetingUrl = onlineMeetingUrl;
	}

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

	public End getEnd() {
		return end;
	}

	public void setEnd(End end) {
		this.end = end;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Object> getLocations() {
		return locations;
	}

	public void setLocations(List<Object> locations) {
		this.locations = locations;
	}

	public Object getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(Object recurrence) {
		this.recurrence = recurrence;
	}

	public List<Object> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Object> attendees) {
		this.attendees = attendees;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	public void setSummary(String summary) {
		this.subject = summary;
		// if(body == null) {
		// body = new Body();
		// body.setContentType("HTML");
		// }
		// body.setContent(summary);
	}

}
