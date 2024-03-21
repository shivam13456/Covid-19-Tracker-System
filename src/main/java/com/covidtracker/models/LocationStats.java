package com.covidtracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int LatestTotalCases;
    private int DiffFromPrevDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return LatestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }

    public int getDiffFromPrevDay() {
        return DiffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        DiffFromPrevDay = diffFromPrevDay;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", LatestTotalCases=" + LatestTotalCases +
                ", DiffFromPrevDay=" + DiffFromPrevDay +
                '}';
    }
}
