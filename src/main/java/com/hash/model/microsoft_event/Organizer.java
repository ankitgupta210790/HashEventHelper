
package com.hash.model.microsoft_event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organizer {

    @SerializedName("EmailAddress")
    @Expose
    private EmailAddress emailAddress;

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

}
