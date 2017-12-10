package com.gameforge.ogame;

public abstract class Planet {
    protected int galaxy;
    protected int system;
    protected int position;

    protected Planet(int galaxy, int system, int position) {
        this.galaxy = galaxy;
        this.system = system;
        this.position = position;
    }

    public int calculateDistance(Planet planet) {
        return Math.abs(galaxy - planet.galaxy) *100000 +
                Math.abs(system - planet.system) *100 +
                Math.abs(position - planet.position);


    }

    @Override
    public String toString() {
        return "["+galaxy+":"+system+":"+position+"]";
    }
}
