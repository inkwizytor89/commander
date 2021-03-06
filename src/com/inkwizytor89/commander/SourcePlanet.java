package com.inkwizytor89.commander;

public class SourcePlanet extends Planet {

    public static final Integer COORDINATE_INDEX = 0;
    public static final Integer PLANET_ID_INDEX = 1;
    public Integer planetId;

    public SourcePlanet(String informationString) {
        super();
        String[] dataTable = informationString.split("\t");
        loadPlanetCoordinate(dataTable[COORDINATE_INDEX]);
        planetId = new Integer(dataTable[PLANET_ID_INDEX]);
    }
}
