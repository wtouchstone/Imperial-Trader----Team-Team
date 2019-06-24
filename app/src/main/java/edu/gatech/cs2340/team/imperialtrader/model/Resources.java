package edu.gatech.cs2340.team.imperialtrader.model;

public enum Resources {
    NOSPECIALRESOURCES(0), MINERALRICH(1), MINERALPOOR(2), DESERT(3), LOTSOFWATER(4), RICHSOIL(5), POORSOIL(6), RICHFAUNA(7), LIFELESS(8), WEIRDMUSHROOMS(9), LOTSOFHERBS(10), ARTISTIC(11), WARLIKE(12);
    private int resourseKey;
    private Resources(int resourseKey) { this.resourseKey = resourseKey; }
}
