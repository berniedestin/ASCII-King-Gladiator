package org.example;

import java.util.ArrayList;
import java.util.List;

public class OutputAscii {
    //CONSTANTS FOR COLORS
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    //how to generate title?
    private String[] titleArray = {
            "                                                                                              ",
            "                                                                                              ",
            "    ____     ______   _______   _______   _______            ___ ___   _______    __   __   ________",
            "   / _  |   /  ___/  /  ____/  /__  __/  /__  __/   ____    /  // _/  /__  __/   /  \\ / /  /  _____/",
            "  / /_| |  _\\__  \\  /  /____   __/ /__   __/ /__   /___/   /  _` <    __/ /__   / /\\ V /  /  /__  |",
            " /_/``|_| /______/  \\______/  /______/  /______/          /__/ \\__\\  /______/  /_/  \\_/   \\_______|",
            "                                                                                              ",
            "     ________    ___        ____      _____      _______    ____    ________   _____     _____",
            "    /  _____/   /  /       / _  |    /  _  \\    /__  __/   / _  |  /__   __/  /  __ \\   /  __ \\",
            "   /  /__  |   /  /____   / /_| |   /  /_|  |   __/ /__   / /_| |    /  /    /  /_/ /  /  /_/ /",
            "   \\_______|  /_______/  /_/  |_|  /_______/   /______/  /_/  |_|   /__/     \\_____/  /__/``\\_\\",
            "                                                                                              ",
            "                                                                                              "
    };

    private String[] swordsCrossed = {
            "",
            "           A        A",
            "    | \\      / |",
            "     \\ \\    / /",
            "       \\ \\  / /",
            "        \\ \\/ /",
            "              \\/ /",
            "              / /\\",
            "            / /\\ \\",
            "          \\/ /  \\ \\/",
            "          /\\/    \\/\\",
            "          / /\\    /\\ \\",
            "         /_/        \\_\\"
    };

    private String[] lineArray = {
            " _____________________________________________________________________________________________________________________",
            "/____________________________________________________________________________________________________________________/"
    };
    private String[] fightArray = {
            "   _______   _______    ________    ___   __   ________   ___ ",
            "  /  ____/  /__  __/   /  _____/   /  /__/ /  /__   __/  /  /",
            " /  ___/    __/ /__   /  /__  |   /  ___  /     /  /    /__/ ",
            "/__/       /______/   \\_______|  /__/  /_/     /__/    /__/ "
    };
    private String[] arenaTop = {
            "    ________________________________________________________________________________    ",
            "   ///============================================================================\\\\\\   ",
            "  ///                                                                              \\\\\\  ",
            " ///                                                                                \\\\\\ ",
            "|||                                                                                  |||",
            "|||                                                                                  |||",
            "|||                                                                                  |||",
            "|||                                                                                  |||",
            "|||                                                                                  |||",
            "|||                                                                                  |||"
    };
    private String[] arenaSide = {
            "|||",
            "|||",
            "|||",
            "|||",
            "|||"
    };
    private String[] arenaFloor = {
            "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
    };

    public void printAsciiTitle(){
        for (String line : lineArray){
            System.out.println(PURPLE_BOLD_BRIGHT + line + RESET );
        }
        for(int i = 0; i < titleArray.length; i++){
            System.out.println(BLUE_BOLD_BRIGHT + titleArray[i] + RED_BOLD_BRIGHT + swordsCrossed[i] + RESET );
        }
        for (String line : lineArray){
            System.out.println(GREEN_BOLD_BRIGHT + line + RESET);
        }

    }
    public List<String> getStringListFromArray(String[] arrays){
        // is this even necessary???
        List<String> list = new ArrayList<>();
        for (String array : arrays){
            list.add(array);
        }

        return list;
    }
    public static String generateSpaces(int num){
        //CREATES AN EMPTY STRING OF num LENGTH
        String spaces = "";
        if (num > 0){
            for( int i = 0; i < num; i++){
                spaces += " ";
            }
        }

        return spaces;
    }
    public void printSprite(String[] sprite){
        for ( String line : sprite){
            System.out.println(line);
        }
    }
    public void printSprite(String[] sprite, String color){
        for ( String line : sprite){
            System.out.println(color + line + RESET);
        }
    }
    public void printSprite(String[] sprite, String color, int space){
        for ( String line : sprite){
            System.out.println(generateSpaces(space) + color + line + RESET);
        }
    }

    public void printArena(String[] pc, String pcColor, String[] npc, String npcColor){
        printSprite(fightArray,RED_BOLD_BRIGHT, 13 +17);
        printSprite(arenaTop, WHITE_BOLD_BRIGHT, 17);
        for ( int i = 0 ; i < 5 ; i++){
            System.out.println(generateSpaces(17) + WHITE_BOLD_BRIGHT + arenaSide[i] + RESET + generateSpaces(3) +
                                pcColor + pc[i] + RESET + generateSpaces(2) +
                                npcColor + npc[i] + RESET + generateSpaces(3) +
                                WHITE_BOLD_BRIGHT + arenaSide[i] + RESET);
        }
        System.out.println(generateSpaces(17) + GREEN_BOLD_BRIGHT + arenaFloor[0] + RESET);

    }
    public String generateHealthBar(int might){
        String healthBar = "HP: " + GREEN_BOLD_BRIGHT;
        for(int i = 1 ; i <= might; i++){
            healthBar += "+";
        }
        healthBar += RESET;
        return healthBar;
    }
    public String generateHealthBar(int might, int currentHP){
        String healthBar = "HP: ";
        if ( currentHP > 0) {
            healthBar += GREEN_BOLD_BRIGHT;
            for (int i = 1; i <= currentHP; i++) {
                healthBar += "+";
            }
            healthBar += PURPLE_BOLD_BRIGHT;
            for (int i = 1; i <= might - currentHP; i++) {
                healthBar += "-";
            }
            healthBar += RESET;
        } else {
            healthBar += PURPLE_BOLD_BRIGHT;
            for (int i = 1; i <= might; i++) {
                healthBar += "-";
            }
            healthBar += RESET;

        }
        return healthBar;
    }
    public void startCombat(Character pc, Character npc){
        System.out.println(CYAN_BOLD_BRIGHT + pc.getName() + RESET + generateSpaces(106 - pc.getName().length()) +
                RED_BOLD_BRIGHT + npc.getName() + RESET);
        String pcHP = generateHealthBar(pc.getMight());
        String npcHP = generateHealthBar(npc.getMight());
        System.out.print(pcHP + generateSpaces(115 - pcHP.length() - npcHP.length() +
                        CYAN_BOLD_BRIGHT.length() + RESET.length() + RED_BOLD_BRIGHT.length() + RESET.length()) +
                npcHP);

    }
    public void combatRound(Character pc, Character npc, String result){
        String pcHealthBar = generateHealthBar(pc.getMight(),pc.getCurrentHealth());
        String npcHealthBar = generateHealthBar(npc.getMight(), npc.getCurrentHealth());
        int spaceLength =  (155 - (result.length() + pcHealthBar.length() + npcHealthBar.length() -
                GREEN_BOLD_BRIGHT.length() - PURPLE_BOLD_BRIGHT.length() - RESET.length()) ) / 2 ;
        System.out.print(pcHealthBar + generateSpaces(spaceLength) + result + generateSpaces(spaceLength) + npcHealthBar);
    }
    public void store(){
        System.out.println("What would you like to upgrade?");

    }



}
