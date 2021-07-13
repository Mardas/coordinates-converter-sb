package com.coordinatesconvertersb.coordinatesconvertersb.model;

public class DDcoordinates {
    private Double latitude;
    private Double longitude;

    public DDcoordinates(){};

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return this.latitude.toString() + ";" + this.longitude.toString();
    }
}
