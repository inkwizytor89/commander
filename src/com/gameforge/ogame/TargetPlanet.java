package com.gameforge.ogame;

public class TargetPlanet extends Planet {
    private static final int COORDINATE_INDEX = 0;
    public static final int POWER_INDEX = 1;
    public Integer power = 5000;

    protected TargetPlanet(int galaxy, int system, int position) {
        super(galaxy, system, position);
    }

    protected TargetPlanet(int galaxy, int system, int position, int power) {
        super(galaxy, system, position);
        this.power = power;
    }

    public TargetPlanet(String informationString) {
        super();
        String[] dataTable = informationString.split("\t");
        loadPlanetCoordinate(dataTable[COORDINATE_INDEX]);
        power = new Integer(dataTable[POWER_INDEX].replaceAll("\\.",""));
    }

    @Override
    public String toString() {
        return super.toString();//+"("+power+")";
    }
}
