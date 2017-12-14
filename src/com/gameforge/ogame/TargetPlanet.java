package com.gameforge.ogame;

public class TargetPlanet extends Planet {
    private static final Integer COORDINATE_INDEX = 0;
    public static final Integer POWER_INDEX = 1;
    public Integer power = 5000;

    public TargetPlanet(String informationString) {
        super();
        String[] dataTable = informationString.split("\\s+");
        loadPlanetCoordinate(dataTable[COORDINATE_INDEX]);
        power = new Integer(dataTable[POWER_INDEX].replaceAll("\\.",""));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
