package com;

import java.util.HashMap;
import java.util.Map;

public class RideAdapter {
    Map<RideCategory,FareParams> paramsMap=null;
    public RideAdapter()
    {
        paramsMap=new HashMap<>();
        paramsMap.putAll(new FareInitializer().getFareParamList());
    }

    public double calculateFare(RideCategory category, double distance, int time) {

        double totalFare = 0;
        if (category.equals(RideCategory.NORMALRIDE)) {
            FareParams  fareParams=paramsMap.get(RideCategory.NORMALRIDE);

            totalFare = distance * fareParams.getFareMinimumCostPerKm() + time * fareParams.getFareConstPerTime();
            if (totalFare < fareParams.getMinimumFare())
                return fareParams.getMinimumFare();
            return totalFare;
        } else if (category.equals(RideCategory.PREMIUMRIDE)) {
            FareParams fareParams=paramsMap.get(RideCategory.PREMIUMRIDE);
            totalFare = distance * fareParams.getFareMinimumCostPerKm() + time * fareParams.getFareConstPerTime();
            if (totalFare < fareParams.getMinimumFare())
                return fareParams.getMinimumFare();
            return totalFare;
        }


        return 0;
    }

   }
