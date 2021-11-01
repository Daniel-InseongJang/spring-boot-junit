package com.inseong.demo;

import com.inseong.demo.domain.weather.ClimateOfHawaii;
import com.inseong.demo.domain.weather.ClimateOfSeoul;
import com.inseong.demo.domain.weather.Season;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeasonTest {

    @Test
    void 서울_계절() {
        ClimateOfSeoul climateOfSeoul = new ClimateOfSeoul();
        Season season = new Season(climateOfSeoul);

        assertEquals(season.getClimateOfCity(),"Autumn", "Fail Message");
    }

    @Test
    void 하와이_계절() {
        ClimateOfHawaii climateOfHawaii = new ClimateOfHawaii();
        Season season = new Season(climateOfHawaii);

        assertEquals(season.getClimateOfCity(), "Winter", "Fail Message");
    }

}
