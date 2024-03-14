package org.example;

import java.util.HashMap;
import java.util.Map;

public class Equipment {
    private Head head = new Head(Head.NONE);
    //private String chest;
    //private String legs;
    private Body body = new Body(Body.BASIC);
    private Handable leftHand = new Sword(Sword.SWORD_LH_LVL_1, 2);
    private Handable rightHand =  new Shield(Shield.SHIELD_LVL_1, 1);
    private String special;

    //GETTERS FOR ITEM MAPS
    public static Map<Integer, String[]> getHeadTracker(){
        Map<Integer,String[]> headTracker = new HashMap<>();
        headTracker.put(0,Head.NONE);
        headTracker.put(1, Head.HELMET);
        return headTracker;

    }
    public static Map<Integer, String[]> getBodyTracker(){
        Map<Integer,String[]> bodyTracker = new HashMap<>();
        bodyTracker.put(1,Body.BASIC);
        bodyTracker.put(2,Body.TALl);
        bodyTracker.put(3,Body.ARMORED);
        return bodyTracker;

    }
    public static Map<Integer, String[]> getLhSwordTracker(){
        Map<Integer,String[]> lhSwordTracker = new HashMap<>();
        lhSwordTracker.put(1,Sword.SWORD_LH_LVL_1);
        lhSwordTracker.put(2,Sword.SWORD_LH_LVL_2);
        lhSwordTracker.put(3,Sword.SWORD_LH_LVL_3);
        lhSwordTracker.put(4,Sword.SWORD_LH_LVL_4);
        return lhSwordTracker;

    }
    public static Map<Integer, String[]> getShieldTracker(){
        Map<Integer,String[]> shieldTracker = new HashMap<>();
        shieldTracker.put(1,Shield.SHIELD_LVL_1);
        shieldTracker.put(2,Shield.SHIELD_LVL_2);
        shieldTracker.put(3,Shield.SHIELD_LVL_3);
        shieldTracker.put(4,Shield.SHIELD_LVL_4);
        return shieldTracker;

    }

    //GETTERS AND SETTERS


    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Handable getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Handable leftHand) {
        this.leftHand = leftHand;
    }

    public Handable getRightHand() {
        return rightHand;
    }

    public void setRightHand(Handable rightHand) {
        this.rightHand = rightHand;
    }
}
