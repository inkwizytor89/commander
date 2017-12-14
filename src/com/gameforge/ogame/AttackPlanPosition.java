package com.gameforge.ogame;

import org.jetbrains.annotations.NotNull;

public class AttackPlanPosition implements Comparable {
    public SourcePlanet sourcePlanet;
    public TargetPlanet targetPlanet;
    public Double priority;


    public void calculatePriority() {
        priority = targetPlanet.power.doubleValue() / targetPlanet.calculateDistance(sourcePlanet).doubleValue();
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return -priority.compareTo(((AttackPlanPosition)o).priority);
    }

    @Override
    public String toString() {
        return sourcePlanet+" -> "+targetPlanet + "["+priority+ "]";
    }

    public String toLable() {
        return sourcePlanet+" -> "+targetPlanet;
    }

}
