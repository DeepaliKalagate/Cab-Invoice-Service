package com;

public class FareParams {
    private   int fareConstPerTime = 1;
    private   double fareMinimumCostPerKm = 10;
    private   double minimumFare = 5;

    public int getFareConstPerTime() {
        return fareConstPerTime;
    }

    public void setFareConstPerTime(int fareConstPerTime) {
        this.fareConstPerTime = fareConstPerTime;
    }

    public double getFareMinimumCostPerKm() {
        return fareMinimumCostPerKm;
    }

    public void setFareMinimumCostPerKm(double fareMinimumCostPerKm) {
        this.fareMinimumCostPerKm = fareMinimumCostPerKm;
    }

    public double getMinimumFare() {
        return minimumFare;
    }

    public void setMinimumFare(double minimumFare) {
        this.minimumFare = minimumFare;
    }
}
