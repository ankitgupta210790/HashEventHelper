
package com.hash.model.google_event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attendee {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("organizer")
    @Expose
    private Boolean organizer;
    @SerializedName("self")
    @Expose
    private Boolean self;
    @SerializedName("resource")
    @Expose
    private Boolean resource;
    @SerializedName("optional")
    @Expose
    private Boolean optional;
    @SerializedName("responseStatus")
    @Expose
    private String responseStatus;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("additionalGuests")
    @Expose
    private Integer additionalGuests;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Boolean organizer) {
        this.organizer = organizer;
    }

    public Boolean getSelf() {
        return self;
    }

    public void setSelf(Boolean self) {
        this.self = self;
    }

    public Boolean getResource() {
        return resource;
    }

    public void setResource(Boolean resource) {
        this.resource = resource;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getAdditionalGuests() {
        return additionalGuests;
    }

    public void setAdditionalGuests(Integer additionalGuests) {
        this.additionalGuests = additionalGuests;
    }

}
