package com.coordinatesconvertersb.coordinatesconvertersb.model;

import java.util.Objects;


public class Coordinates {
    private String coordinates;
    private CoordinatesFormat coordinatesFormat;

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public CoordinatesFormat getCoordinatesFormat() {
        return coordinatesFormat;
    }

    public void setCoordinatesFormat(CoordinatesFormat coordinatesFormat) {
        this.coordinatesFormat = coordinatesFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return getCoordinates().equals(that.getCoordinates()) &&
                getCoordinatesFormat() == that.getCoordinatesFormat();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoordinates(), getCoordinatesFormat());
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinates=" + coordinates +
                ", coordinatesFormat=" + coordinatesFormat +
                '}';
    }
}
