
package com.hash.model.google_event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedProperties {

    @SerializedName("private")
    @Expose
    private Private _private;
    @SerializedName("shared")
    @Expose
    private Shared shared;

    public Private getPrivate() {
        return _private;
    }

    public void setPrivate(Private _private) {
        this._private = _private;
    }

    public Shared getShared() {
        return shared;
    }

    public void setShared(Shared shared) {
        this.shared = shared;
    }

}
