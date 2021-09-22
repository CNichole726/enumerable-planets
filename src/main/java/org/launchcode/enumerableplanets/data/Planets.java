package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, true),
    VENUS("Venus", 225, true),
    EARTH("Earth", 365, true),
    MARS("Mars", 687, true),
    JUPITER("Jupiter", 4333, false),
    SATURN("Saturn", 10759, false),
    URANUS("Uranus", 30687, false),
    NEPTUNE("Neptune", 60200, false);

    private final String name;
    private final int yearLength;
    private final boolean isInner;

    Planets(String name, int yearLength, boolean isInner) {
        this.name = name;
        this.yearLength = yearLength;
        this.isInner = isInner;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public boolean isInner() {
        return isInner;
    }
}
