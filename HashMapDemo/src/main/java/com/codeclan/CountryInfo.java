package com.codeclan;

public class CountryInfo {
    private String capital;
    private String continent;
    private Integer population;

    public CountryInfo(String capital, String continent, Integer  population){
        this.capital = capital;
        this.continent = continent;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }
    public String getContinent() {
        return continent;
    }
    public Integer getPopulation(){
        return population;
    }
}
