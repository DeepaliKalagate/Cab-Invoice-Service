package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FareInitializer {
    Map<RideCategory, FareParams> fareParamList;

    public FareInitializer() {
        fareParamList = new HashMap<>();
        FareParams normalFare = new FareParams();
        normalFare.setMinimumFare(5);
        normalFare.setFareConstPerTime(1);
        normalFare.setFareMinimumCostPerKm(10);

        this.fareParamList.put(RideCategory.NORMALRIDE, normalFare);

        FareParams premiumFare = new FareParams();
        premiumFare.setMinimumFare(20);
        premiumFare.setFareConstPerTime(2);
        premiumFare.setFareMinimumCostPerKm(15);
        this.fareParamList.put(RideCategory.PREMIUMRIDE, premiumFare);

    }

    public Map<RideCategory, FareParams> getFareParamList() {
        return fareParamList;
    }

}
