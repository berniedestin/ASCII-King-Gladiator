package org.example;

public class Person {
    private int unleashRoundTracker = 0;
    private String name;
    private int might;
    private int speed;
    private int intellect;
    private Equipment currentLoadout = new Equipment();
    private int damage = 0;
    private final int UNLEASH_ROUND_THRESHOLD = 3;
    private int opponentsDefeated = 0;// make this affect hp as hp mod

    //Constructors


    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equipment getCurrentLoadout() {
        return currentLoadout;
    }

    public void setCurrentLoadout(Equipment currentLoadout) {
        this.currentLoadout = currentLoadout;
    }
    public int getMight(){
        return might;
    }
    public void setMight(int might){
        this.might = might + currentLoadout.getBody().getHealthMod();
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void takeDamage(int damage){
        if ( damage > 0){
            this.damage += damage;
        }
    }
    public void resetHealth(){
        this.damage = 0;
    }

    public int getCurrentHealth(){
        return might - damage;
    }

    public int getUnleashRoundTracker() {
        return unleashRoundTracker;
    }


    public void incrementUnleashRoundTracker(String adu) {
        if ( adu.equalsIgnoreCase("u")){
            unleashRoundTracker++;
        } else if( unleashRoundTracker > 0){
            unleashRoundTracker = unleashRoundTracker < UNLEASH_ROUND_THRESHOLD ?
                    unleashRoundTracker + 1 :
                    0;
        }

    }
//Behavior

    //Generate Sprite
    public String[] spriteGen() {
        String[] charSprite = new String[5];
        String[] headSprite = currentLoadout.getHead().getItemSprite();
        String[] bodySprite = currentLoadout.getBody().getItemSprite();
        String[] lhSprite = currentLoadout.getLeftHand().getItemSprite();
        String[] rhSprite = currentLoadout.getRightHand().getItemSprite();
        final int TOTAL_WIDTH = 37;
        int height = headSprite.length +
                bodySprite.length;

        if (height < 5) {
            charSprite[0] = OutputAscii.generateSpaces(TOTAL_WIDTH);

            charSprite[1] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[0].length() + 3 + rhSprite[0].length()))/2) +
                            lhSprite[0] + OutputAscii.generateSpaces(3) + rhSprite[0] +
                            OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[0].length() + 3 + rhSprite[0].length()))/2);

            charSprite[2] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[1].length() + headSprite[0].length() + rhSprite[1].length()))/2) +
                            lhSprite[1] + headSprite[0] + rhSprite[1] +
                            OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[1].length() + headSprite[0].length() + rhSprite[1].length()))/2);

            charSprite[3] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[2].length() + bodySprite[0].length() + rhSprite[2].length()))/2) +
                            lhSprite[2] + bodySprite[0] + rhSprite[2] +
                            OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[2].length() + bodySprite[0].length() + rhSprite[2].length()))/2);

            charSprite[4] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[3].length() + bodySprite[1].length() + rhSprite[3].length()))/2) +
                            lhSprite[3] + bodySprite[1] + rhSprite[3] +
                            OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[3].length() + bodySprite[1].length() + rhSprite[3].length()))/2);
        } else {
            charSprite[0] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[0].length() + bodySprite[2].length() + rhSprite[0].length()))/2) +
                    lhSprite[0] + OutputAscii.generateSpaces((bodySprite[2].length() - headSprite[0].length())/2) +
                    headSprite[0] +
                    rhSprite[0] + OutputAscii.generateSpaces((bodySprite[2].length() - headSprite[0].length())/2) +
                    OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[0].length() + bodySprite[2].length() + rhSprite[0].length()))/2);

            charSprite[1] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[1].length() + bodySprite[2].length() + rhSprite[1].length()))/2) +
                    lhSprite[1] + bodySprite[0] + rhSprite[1] +
                    OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[1].length() + bodySprite[2].length() + rhSprite[1].length()))/2);

            charSprite[2] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[2].length() + bodySprite[2].length() + rhSprite[2].length()))/2) +
                    lhSprite[2] + bodySprite[1] + rhSprite[2] +
                    OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[2].length() + bodySprite[2].length() + rhSprite[2].length()))/2);

            charSprite[3] = OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[3].length() + bodySprite[2].length() + rhSprite[3].length()))/2) +
                    lhSprite[3] + bodySprite[2] + rhSprite[3] +
                    OutputAscii.generateSpaces( (TOTAL_WIDTH - (lhSprite[3].length() + bodySprite[2].length() + rhSprite[3].length()))/2);

            charSprite[4] = OutputAscii.generateSpaces( (TOTAL_WIDTH - bodySprite[2].length())/2) +
                    bodySprite[3] +
                    OutputAscii.generateSpaces( (TOTAL_WIDTH - bodySprite[2].length())/2);

        }


        return charSprite;
    }

}
