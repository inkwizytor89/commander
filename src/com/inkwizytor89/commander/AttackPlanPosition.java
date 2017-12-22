package com.inkwizytor89.commander;

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
        return targetPlanet+" <- "+sourcePlanet + "["+priority+ "]";
    }

    public String toLable() {
        return targetPlanet+" <- "+sourcePlanet;
    }

}
