package com;

public class InvoiceService extends RideAdapter{
    private RideRepository rideRepository;
    RideCategory rideCategory;

    RideAdapter rideAdapter = new RideAdapter();

    public double calculateFare(RideCategory category, double distance, int time) {
        return rideAdapter.calculateFare(category, distance, time);
    }

    public InvoiceService() {
        this.rideRepository = new RideRepository();
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += super.calculateFare(rideCategory, ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public void addRide(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    public InvoiceSummary getInvoiceService(String userId, RideCategory rideCategory) {
        this.rideCategory = rideCategory;
        return this.calculateFare(rideRepository.getRides(userId));
    }
}
