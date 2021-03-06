package com.inkwizytor89.commander;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Commander {

    private List <TargetPlanet> targets = new ArrayList<>();
    private List <SourcePlanet> sources = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        new Commander()
            .loadSources(new File("res"+File.separator+"sources.txt"))
            .loadTargets(new File("res"+File.separator+"targets.txt"))
             .showSources(false)
             .showTargets(false)
            .generateAttackPlan();
    }

    private Commander loadSources(File sourcesFile) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(sourcesFile.getAbsolutePath()));
        for (String line : lines) {
            if(!line.isEmpty()) {
                sources.add(new SourcePlanet(line));
            }
        }
        return this;
    }

    private Commander loadTargets(File targetFile) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(targetFile.getAbsolutePath()));
        for (String line : lines) {
            if(!line.isEmpty()) {
                targets.add(new TargetPlanet(line));
            }
        }
        return this;
    }

    private void generateAttackPlan() throws IOException {
        Set<AttackPlanPosition> attackPlanPositions = new TreeSet<>();
        for(TargetPlanet targetPlanet : targets) {
            if(targetPlanet.isSkipped) {
                continue;
            }
            AttackPlanPosition position = new AttackPlanPosition();
            position.sourcePlanet = findNearestSourcePlanet(targetPlanet);
            position.targetPlanet = targetPlanet;
            position.calculatePriority();
            attackPlanPositions.add(position);
        }
        showAttackPlan(attackPlanPositions);

        AttackPlanBuilder builder = new AttackPlanBuilder(attackPlanPositions);
        builder.createFile("res"+File.separator+"out.xml");

    }

    private void showAttackPlan(Set<AttackPlanPosition> attackPlanPositions) {
        for(AttackPlanPosition position : attackPlanPositions) {
            System.out.println(position);
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

    private Commander showSources(boolean isActive) {
        if(!isActive) {
            return this;
        }
        System.out.println("\nSources("+sources.size()+"):");
        for(SourcePlanet planet : sources) {
            System.out.println(planet.toString());
        }
        return this;
    }

    private Commander showTargets(boolean isActive) {
        if(!isActive) {
            return this;
        }
        System.out.println("\nTargets("+targets.size()+"):");
        for(TargetPlanet planet : targets) {
            System.out.println(planet.toString());
        }
        return this;
    }
}
