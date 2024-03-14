package org.example;

import java.util.Locale;

public class Attack {
//    private Character pc;
//    private String pcInput;
//    private Character npc;
//    private String npcInput;

    //CONSTRUCTOR
//    public Attack(Character pc, String pcInput,Character npc, String npcInput){
//        this.pc = pc;
//        this.pcInput = pcInput;
//        this.npc = npc;
//        this.npcInput = npcInput;
//    }

    //GETTERS


    //METHODS
    public static String round(Character pc, String pcInput,Character npc, String npcInput){
        String attackString = "";
        int pcAttack = pc.getCurrentLoadout().getLeftHand().getDamage() + pc.getCurrentLoadout().getRightHand().getDamage() + Main.rollDice(4);
        int pcReduction = pc.getCurrentLoadout().getHead().getDamageReduction() + pc.getCurrentLoadout().getRightHand().getDamageReduction() +
                pc.getCurrentLoadout().getLeftHand().getDamageReduction() + Main.rollDice(2);
        int npcAttack = npc.getCurrentLoadout().getLeftHand().getDamage() + npc.getCurrentLoadout().getRightHand().getDamage() + Main.rollDice(4);
        int npcReduction = npc.getCurrentLoadout().getHead().getDamageReduction() + npc.getCurrentLoadout().getRightHand().getDamageReduction() +
                npc.getCurrentLoadout().getLeftHand().getDamageReduction() + Main.rollDice(2);

        if(pcInput.equalsIgnoreCase("a") && npcInput.equalsIgnoreCase("a")){
            pc.takeDamage(npcAttack);
            npc.takeDamage(pcAttack);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " and " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " clash together!";

        } else if (pcInput.equalsIgnoreCase("a") && npcInput.equalsIgnoreCase("d")){
            pc.takeDamage(npcReduction - pcAttack); //should only take damage if DR is greater than attack
            npc.takeDamage(pcAttack - npcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " attacks and  " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " expertly defends!";
        } else if (pcInput.equalsIgnoreCase("a") && npcInput.equalsIgnoreCase("u")){
            pc.takeDamage((npcAttack * 2) - pcReduction);
            npc.takeDamage(pcAttack - npcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " attacks, but " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " unleashes full fury!";
        } else if (pcInput.equalsIgnoreCase("d") && npcInput.equalsIgnoreCase("a")){
            npc.takeDamage(pcReduction - npcAttack); //should only take damage if DR is greater than attack
            pc.takeDamage(npcAttack - pcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " expertly defends while " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " attacks!";
        } else if (pcInput.equalsIgnoreCase("d") && npcInput.equalsIgnoreCase("d")){
            pc.takeDamage(npcReduction - pcReduction);
            npc.takeDamage(pcReduction - npcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " and " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " test out each other's defenses!";
        } else if (pcInput.equalsIgnoreCase("d") && npcInput.equalsIgnoreCase("u")){
            pc.takeDamage((npcAttack *2) - pcReduction);
            npc.takeDamage(pcReduction - (npcAttack * 2));
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " expertly defends, while " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " unleashes full fury!";
        }else if (pcInput.equalsIgnoreCase("u") && npcInput.equalsIgnoreCase("a")){
            pc.takeDamage(npcAttack - pcReduction);
            npc.takeDamage((pcAttack * 2) - npcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " unleashes full fury, while " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " attacks!";
        }else if (pcInput.equalsIgnoreCase("u") && npcInput.equalsIgnoreCase("d")){
            pc.takeDamage(npcReduction - (pcAttack * 2));
            npc.takeDamage((pcAttack *2) - npcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " unleashes full fury, while " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " expertly defends!";
        }else if (pcInput.equalsIgnoreCase("u") && npcInput.equalsIgnoreCase("u")){
            pc.takeDamage((npcAttack *2) - pcReduction);
            npc.takeDamage((pcAttack *2) - npcReduction);
            attackString = OutputAscii.CYAN_BOLD_BRIGHT +  pc.getName() + OutputAscii.RESET +
                    " and " +
                    OutputAscii.RED_BOLD_BRIGHT + npc.getName() + OutputAscii.RESET +
                    " both unleash full fury!!";
        }


        return attackString;
    }

}
