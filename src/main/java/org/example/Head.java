package org.example;

import java.util.HashMap;
import java.util.Map;

public class Head extends Item {
    public static final String[] NONE = new String[]{" O "};
    public static final String[] HELMET = new String[]{"(O)"};
    //private static Map<Integer,String[]> headTracker = new HashMap<>();

    private int damageReduction;

    //CONSTRUCTOR
    public Head(String[] itemSprite){
        super(itemSprite);
    }
    public Head(String[] itemSprite, int damageReduction){
        super(itemSprite);
        this.damageReduction = damageReduction;
    }

    //GETTERS


    public int getDamageReduction() {
        return damageReduction;
    }
    public void setDamageReduction(int damageReduction){
        this.damageReduction = damageReduction;
    }
}
