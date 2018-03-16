
package com.hash.model.google_event;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

	private String calenderId;

	public Event(String calenderId) {
		this.calenderId = calenderId;
	}

	@SerializedName("kind")
	@Expose
	private String kind;
	@SerializedName("etag")
	@Expose
	private String etag;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("htmlLink")
	@Expose
	private String htmlLink;
	@SerializedName("created")
	@Expose
	private String created;
	@SerializedName("updated")
	@Expose
	private String updated;
	@SerializedName("summary")
	@Expose
	protected String summary;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("location")
	@Expose
	private String location;
	@SerializedName("colorId")
	@Expose
	private String colorId;
	@SerializedName("creator")
	@Expose
	private Creator creator;
	@SerializedName("organizer")
	@Expose
	private Organizer organizer;
	@SerializedName("start")
	@Expose
	protected Start start;
	@SerializedName("end")
	@Expose
	protected End end;
	@SerializedName("endTimeUnspecified")
	@Expose
	private Boolean endTimeUnspecified;
	@SerializedName("recurrence")
	@Expose
	private List<String> recurrence = null;
	@SerializedName("recurringEventId")
	@Expose
	private String recurringEventId;
	@SerializedName("originalStartTime")
	@Expose
	private OriginalStartTime originalStartTime;
	@SerializedName("transparency")
	@Expose
	private String transparency;
	@SerializedName("visibility")
	@Expose
	private String visibility;
	@SerializedName("iCalUID")
	@Expose
	private String iCalUID;
	@SerializedName("sequence")
	@Expose
	private Integer sequence;
	@SerializedName("attendees")
	@Expose
	protected List<Attendee> attendees = null;
	@SerializedName("attendeesOmitted")
	@Expose
	private Boolean attendeesOmitted;
	@SerializedName("extendedProperties")
	@Expose
	private ExtendedProperties extendedProperties;
	@SerializedName("hangoutLink")
	@Expose
	private String hangoutLink;
	@SerializedName("conferenceData")
	@Expose
	private ConferenceData conferenceData;
	@SerializedName("gadget")
	@Expose
	private Gadget gadget;
	@SerializedName("anyoneCanAddSelf")
	@Expose
	private Boolean anyoneCanAddSelf;
	@SerializedName("guestsCanInviteOthers")
	@Expose
	private Boolean guestsCanInviteOthers;
	@SerializedName("guestsCanModify")
	@Expose
	private Boolean guestsCanModify;
	@SerializedName("guestsCanSeeOtherGuests")
	@Expose
	private Boolean guestsCanSeeOtherGuests;
	@SerializedName("privateCopy")
	@Expose
	private Boolean privateCopy;
	@SerializedName("locked")
	@Expose
	private Boolean locked;
	@SerializedName("reminders")
	@Expose
	private Reminders reminders;
	@SerializedName("source")
	@Expose
	private Source source;
	@SerializedName("attachments")
	@Expose
	private List<Attachment> attachments = null;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHtmlLink() {
		return htmlLink;
	}

	public void setHtmlLink(String htmlLink) {
		this.htmlLink = htmlLink;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColorId() {
		return colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	public Creator getCreator() {
		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
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

	public Boolean getEndTimeUnspecified() {
		return endTimeUnspecified;
	}

	public void setEndTimeUnspecified(Boolean endTimeUnspecified) {
		this.endTimeUnspecified = endTimeUnspecified;
	}

	public List<String> getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(List<String> recurrence) {
		this.recurrence = recurrence;
	}

	public String getRecurringEventId() {
		return recurringEventId;
	}

	public void setRecurringEventId(String recurringEventId) {
		this.recurringEventId = recurringEventId;
	}

	public OriginalStartTime getOriginalStartTime() {
		return originalStartTime;
	}

	public void setOriginalStartTime(OriginalStartTime originalStartTime) {
		this.originalStartTime = originalStartTime;
	}

	public String getTransparency() {
		return transparency;
	}

	public void setTransparency(String transparency) {
		this.transparency = transparency;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getICalUID() {
		return iCalUID;
	}

	public void setICalUID(String iCalUID) {
		this.iCalUID = iCalUID;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public List<Attendee> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<Attendee> attendees) {
		this.attendees = attendees;
	}

	public Boolean getAttendeesOmitted() {
		return attendeesOmitted;
	}

	public void setAttendeesOmitted(Boolean attendeesOmitted) {
		this.attendeesOmitted = attendeesOmitted;
	}

	public ExtendedProperties getExtendedProperties() {
		return extendedProperties;
	}

	public void setExtendedProperties(ExtendedProperties extendedProperties) {
		this.extendedProperties = extendedProperties;
	}

	public String getHangoutLink() {
		return hangoutLink;
	}

	public void setHangoutLink(String hangoutLink) {
		this.hangoutLink = hangoutLink;
	}

	public ConferenceData getConferenceData() {
		return conferenceData;
	}

	public void setConferenceData(ConferenceData conferenceData) {
		this.conferenceData = conferenceData;
	}

	public Gadget getGadget() {
		return gadget;
	}

	public void setGadget(Gadget gadget) {
		this.gadget = gadget;
	}

	public Boolean getAnyoneCanAddSelf() {
		return anyoneCanAddSelf;
	}

	public void setAnyoneCanAddSelf(Boolean anyoneCanAddSelf) {
		this.anyoneCanAddSelf = anyoneCanAddSelf;
	}

	public Boolean getGuestsCanInviteOthers() {
		return guestsCanInviteOthers;
	}

	public void setGuestsCanInviteOthers(Boolean guestsCanInviteOthers) {
		this.guestsCanInviteOthers = guestsCanInviteOthers;
	}

	public Boolean getGuestsCanModify() {
		return guestsCanModify;
	}

	public void setGuestsCanModify(Boolean guestsCanModify) {
		this.guestsCanModify = guestsCanModify;
	}

	public Boolean getGuestsCanSeeOtherGuests() {
		return guestsCanSeeOtherGuests;
	}

	public void setGuestsCanSeeOtherGuests(Boolean guestsCanSeeOtherGuests) {
		this.guestsCanSeeOtherGuests = guestsCanSeeOtherGuests;
	}

	public Boolean getPrivateCopy() {
		return privateCopy;
	}

	public void setPrivateCopy(Boolean privateCopy) {
		this.privateCopy = privateCopy;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Reminders getReminders() {
		return reminders;
	}

	public void setReminders(Reminders reminders) {
		this.reminders = reminders;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public void setCalenderId(String calenderId) {
		this.calenderId = calenderId;
	}

	public String getCalenderId() {
		return calenderId;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + " Status: " + status + " Start Time: " + start.getDateTime() + " end Time: "
				+ end.getDateTime() + " Summary: " + summary;
	}
}
