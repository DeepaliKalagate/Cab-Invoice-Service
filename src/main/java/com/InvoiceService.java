package com;

public class InvoiceService {
    private static final int NORMAL_COST_PER_TIME = 1;
    private static final double NORMAL_MINIMUM_COST_PER_KILOMETER = 10;
    private static final double NORMAL_MINIMUM_FARE = 5;

    private static final int PREMIUM_COST_PER_TIME = 1;
    private static final double PREMIUM_MINIMUM_COST_PER_KILOMETER = 10;
    private static final double PREMIUM_MINIMUM_FARE = 5;
    private RideRepository rideRepository;

    public double calculateFare(double distance, int time) {
        if (RideCategory.NORMALRIDE){}

        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
}

    public InvoiceService() {
        this.rideRepository = new RideRepository();
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public void addRide(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    public InvoiceSummary getInvoiceServide(String userId) {
        return this.calculateFare(rideRepository.getRides(userId));
    }
}
