package com.example.planetsapp;

public class Planet {
    private String planetName;
    private String moonCount;
    private int imageRes;

    public Planet(String planetName, String moonCount, int imageRes) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.imageRes = imageRes;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }


}
