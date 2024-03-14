package org.example;

import java.util.HashMap;
import java.util.Map;

public class Sword extends Item implements Handable{

    public static final String[] SWORD_LH_LVL_1 = new String[]{
            "              ",
            "              ",
            "          <=]-",
            "              "

    };
    public static final String[] SWORD_LH_LVL_2 = new String[]{
            "              ",
            "              ",
            "         <==]-",
            "              "

    };
    public static final String[] SWORD_LH_LVL_3 = new String[]{
            "              ",
            "              ",
            "        <===]-",
            "              "

    };
    public static final String[] SWORD_LH_LVL_4 = new String[]{
            "              ",
            "              ",
            "<=========}--o",
            "              "

    };
    public static final String[] SWORD_RH_LVL_1 = new String[]{
            "    ",
            "    ",
            "-[=>",
            "    "

    };
    public static Map<Integer,String[]> swordTracker = new HashMap<>();

    private int damage;
    private int damageReduction;

    //CONSTRUCTOR
    public Sword(String[] itemSprite,int damage){
        super(itemSprite);
        this.damage = damage;

    }
    //GETTERS & SETTERS


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
