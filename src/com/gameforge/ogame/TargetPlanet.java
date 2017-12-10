package com.gameforge.ogame;

public class TargetPlanet extends Planet {
    public double power;

    protected TargetPlanet(int galaxy, int system, int position) {
        super(galaxy, system, position);
        this.power = 5.0;
    }

    protected TargetPlanet(int galaxy, int system, int position, double power) {
        super(galaxy, system, position);
        this.power = power;
    }

}
