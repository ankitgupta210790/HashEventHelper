
package com.hash.model.google_event;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConferenceData {

    @SerializedName("createRequest")
    @Expose
    private CreateRequest createRequest;
    @SerializedName("entryPoints")
    @Expose
    private List<EntryPoint> entryPoints = null;
    @SerializedName("conferenceSolution")
    @Expose
    private ConferenceSolution conferenceSolution;
    @SerializedName("conferenceId")
    @Expose
    private String conferenceId;
    @SerializedName("signature")
    @Expose
    private String signature;
    @SerializedName("notes")
    @Expose
    private String notes;

    public CreateRequest getCreateRequest() {
        return createRequest;
    }

    public void setCreateRequest(CreateRequest createRequest) {
        this.createRequest = createRequest;
    }

    public List<EntryPoint> getEntryPoints() {
        return entryPoints;
    }

    public void setEntryPoints(List<EntryPoint> entryPoints) {
        this.entryPoints = entryPoints;
    }

    public ConferenceSolution getConferenceSolution() {
        return conferenceSolution;
    }

    public void setConferenceSolution(ConferenceSolution conferenceSolution) {
        this.conferenceSolution = conferenceSolution;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
