package org.example;

public class Body extends Item{
    private int healthMod;
    public static final String[] BASIC = new String[]{
            "/|\\",
            "/ \\"
    };
    public static final String[] TALl = new String[]{
            " /[ ]\\ ",
            "/  |  \\",
            "  / \\  ",
            " /   \\ ",

    };
    public static final String[] ARMORED = new String[]{
            " //[ ]\\\\ ",
            "//  |  \\\\",
            "   / \\   ",
            " _|| ||_ ",

    };
    //CONSTRUCTORS
    public Body(String[] itemSprite) {
        super(itemSprite);
    }

    public Body(String[] itemSprite, int healthMod) {
        super(itemSprite);
        this.healthMod = healthMod;
    }

    //GETTERS

    public int getHealthMod() {
        return healthMod;
    }
}
