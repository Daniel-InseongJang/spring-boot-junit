package com.inseong.demo.domain.weather;

// 계절
public class Season {

    //도시별 날씨
    private final ClimateOfCity climateOfCity;

    public Season(ClimateOfCity climateOfCity) {
        this.climateOfCity = climateOfCity;
    }

    public String getClimateOfCity() {
        return climateOfCity.season();
    }
}
