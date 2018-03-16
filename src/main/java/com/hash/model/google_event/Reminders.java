
package com.hash.model.google_event;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reminders {

    @SerializedName("useDefault")
    @Expose
    private Boolean useDefault;
    @SerializedName("overrides")
    @Expose
    private List<Override> overrides = null;

    public Boolean getUseDefault() {
        return useDefault;
    }

    public void setUseDefault(Boolean useDefault) {
        this.useDefault = useDefault;
    }

    public List<Override> getOverrides() {
        return overrides;
    }

    public void setOverrides(List<Override> overrides) {
        this.overrides = overrides;
    }

}
