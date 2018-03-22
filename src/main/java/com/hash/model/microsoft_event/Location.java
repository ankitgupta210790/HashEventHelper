
package com.hash.model.microsoft_event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("DisplayName")
    @Expose
    private String displayName;
    @SerializedName("LocationType")
    @Expose
    private String locationType;
    @SerializedName("UniqueIdType")
    @Expose
    private String uniqueIdType;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("Coordinates")
    @Expose
    private Coordinates coordinates;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getUniqueIdType() {
        return uniqueIdType;
    }

    public void setUniqueIdType(String uniqueIdType) {
        this.uniqueIdType = uniqueIdType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}
