package com.gameforge.ogame;

public abstract class Planet {
    public static final int GALAXY_INDEX = 1;
    public static final int SYSTEM_INDEX = 2;
    public static final int POSITION_INDEX = 3;
    protected int galaxy;
    protected int system;
    protected int position;

    protected Planet() {

    }

    protected Planet(int galaxy, int system, int position) {
        this.galaxy = galaxy;
        this.system = system;
        this.position = position;
    }

    public int calculateDistance(Planet planet) {
        if(galaxy != planet.galaxy) {
            return roundDistance(galaxy, planet.galaxy, 6) *20000;
        }
        if(system != planet.system) {
            return roundDistance(system, planet.system, 499) *95 +2700;
        }
        return roundDistance(position, planet.position, 15)*5+1000;
    }

    private int roundDistance(int x1, int x2, int max) {
        return Math.abs(x1 - x2) < max - Math.abs(x1 - x2) ?  Math.abs(x1 - x2) : max - Math.abs(x1 - x2);
    }

    protected void loadPlanetCoordinate(String coordinateString) {
        String[] numbersTable = coordinateString.split("\\D");
        galaxy = new Integer(numbersTable[GALAXY_INDEX]);
        system = new Integer(numbersTable[SYSTEM_INDEX]);
        position = new Integer(numbersTable[POSITION_INDEX]);
    }

    @Override
    public String toString() {
        return "["+galaxy+":"+system+":"+position+"]";
    }
}
