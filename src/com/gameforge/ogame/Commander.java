package com.gameforge.ogame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Commander {

    private List <TargetPlanet> targets = new ArrayList<>();
    private List <SourcePlanet> sources = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void generateAttackPlan() {
        Set<AttackPlanPosition> attackPlanPositions = new TreeSet<>();
        for(TargetPlanet targetPlanet : targets) {
            AttackPlanPosition position = new AttackPlanPosition();
            position.sourcePlanet = findNearestSourcePlanet(targetPlanet);
            position.targetPlanet = targetPlanet;
            position.calculatePriority();
            attackPlanPositions.add(position);
        }

    }

    private SourcePlanet findNearestSourcePlanet(TargetPlanet planet) {
        Integer bestDistance = Integer.MAX_VALUE;
        SourcePlanet nearest = null;
        for(SourcePlanet source : sources) {
            Integer distance = source.calculateDistance(planet);
            if (bestDistance > distance) {
                bestDistance = distance;
                nearest = source;
            }
        }
        return nearest;
    }
}
