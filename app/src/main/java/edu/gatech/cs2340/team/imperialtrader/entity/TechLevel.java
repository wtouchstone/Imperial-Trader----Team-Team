package edu.gatech.cs2340.team.imperialtrader.entity;

public enum TechLevel {
    PREAGRICULTURE(0), AGRIULTURE(1), MEDIEVAL(2), RENAISSANCE(3), EARLYINDUSTRIAL(4), INDUSTRIAL(5), POSTINDUSTRIAL(6), HITECH(7);
    private int level;
    private TechLevel(int level){this.level = level;}

}