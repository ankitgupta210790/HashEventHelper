
package com.hash.model.google_event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryPoint {

    @SerializedName("entryPointType")
    @Expose
    private String entryPointType;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("pin")
    @Expose
    private String pin;
    @SerializedName("accessCode")
    @Expose
    private String accessCode;
    @SerializedName("meetingCode")
    @Expose
    private String meetingCode;
    @SerializedName("passcode")
    @Expose
    private String passcode;
    @SerializedName("password")
    @Expose
    private String password;

    public String getEntryPointType() {
        return entryPointType;
    }

    public void setEntryPointType(String entryPointType) {
        this.entryPointType = entryPointType;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getMeetingCode() {
        return meetingCode;
    }

    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
