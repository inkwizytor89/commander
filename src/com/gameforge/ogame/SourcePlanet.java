package com.gameforge.ogame;

public class SourcePlanet extends Planet {

    public static final int COORDINATE_INDEX = 0;
    public static final int PLANET_ID_INDEX = 1;
    public Integer planetId;

    protected SourcePlanet(int galaxy, int system, int position, int planetId) {
        super(galaxy, system, position);
        this.planetId = planetId;
    }

    public SourcePlanet(String informationString) {
        super();
        String[] dataTable = informationString.split("\t");
        loadPlanetCoordinate(dataTable[COORDINATE_INDEX]);
        planetId = new Integer(dataTable[PLANET_ID_INDEX]);
    }
}
