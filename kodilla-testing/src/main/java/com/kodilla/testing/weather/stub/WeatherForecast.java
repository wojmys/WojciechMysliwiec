package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }


    public double calculateAverageTemperature() {
        double result = 0;
        int count = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            result += temperature.getValue();
            count++;
        }

        return result / count;
    }

    public double calculateMedianTemperature() {

        double median = 0;

        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            list.add(temperature.getValue());
        }
        Collections.sort(list);

            if (list.size() % 2 == 1) {
                median=list.get((((list.size()+1))/2)-1);


            } else {
              median = list.get(list.size()/2);

            }

            return median;

    }

}
