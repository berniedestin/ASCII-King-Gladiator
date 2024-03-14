package org.example;

public class Shield extends Item implements Handable{
    private int damage = 0;
    private int damageReduction;

    public static final String[] SHIELD_LVL_1 = new String[]{
            "              ",
            "              ",
            "{X}           ",
            "              "
    };
    public static final String[] SHIELD_LVL_2 = new String[]{
            "              ",
            " {X}          ",
            "{XXX}         ",
            " {X}          "
    };
    public static final String[] SHIELD_LVL_3 = new String[]{
            "              ",
            " /X\\          ",
            "<X+X>         ",
            " \\X/          "
    };
    public static final String[] SHIELD_LVL_4 = new String[]{
            "              ",
            " /X\\          ",
            "<X+X>         ",
            " \\X/          "
    };



    //CONSTRUCTOR
    public Shield(String[] itemSprite, int damageReduction){
        super(itemSprite);
        this.damageReduction = damageReduction;
    }

    //GETTERS AND SETTERS


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }
}
