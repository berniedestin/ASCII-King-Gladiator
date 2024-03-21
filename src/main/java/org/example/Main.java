package org.example;


import java.util.*;

public class Main {

    //DATA
    private static Scanner input = new Scanner(System.in);
    private static Person pc = new Person();
    private static OutputAscii op = new OutputAscii();
    private static int roundNumber = 1;

    private static List<String> storeList = Arrays.asList(new String[]{"Head","Body","Sword","Shield"});// sword and shield should be left and right handable



    public static void main(String[] args) {


        //Scanner input = new Scanner(System.in);

        //OutputAscii op = new OutputAscii();
        //System.out.println("Hello world!");
//        op.printAsciiTitle();
        //Character pc = new Character();
//        System.out.print( op.generateSpaces(45)+"Name your gladiator: ");
//        pc.setName(input.nextLine());
//        pc.setMight(rollDice(10) +3);
        startup();


        //System.out.println(op.generateSpaces(40) + "Welcome, gladiator " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() + OutputAscii.RESET + "!");
        //
        //op.printSprite(pc.spriteGen(), OutputAscii.CYAN_BOLD_BRIGHT, 35);
//        Person enemy = npcGenerator(1);
        //Character enemy1 = npcGenerator(1);
        while(roundNumber < 10){
            int modifier = roundNumber/3 + 1;
            boolean isPlayerWinner = isPCVictorious(npcGenerator(modifier));
            roundNumber++;

        }

        //isPCVictorious(npcGenerator(1));

        //Character enemy = new Character();
        //enemy.setName(enemy1.getName());
        //enemy.setMight(rollDice(10) +3);
//        System.out.println(OutputAscii.generateSpaces(40) + "Welcome, " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() +OutputAscii.RESET +
//                ", you'll be facing " + OutputAscii.RED_BOLD_BRIGHT + enemy.getName() + OutputAscii.RESET + "!");

        //op.printSprite(enemy.spriteGen(),OutputAscii.RED_BOLD_BRIGHT);


//        System.out.println("");
//        op.printArena(pc.spriteGen(), OutputAscii.CYAN_BOLD_BRIGHT, enemy.spriteGen(),OutputAscii.RED_BOLD_BRIGHT);
        // [A]ttack, [D]efend, or [U]nleash?

//        op.startCombat(pc,enemy);



        // combat method??
        // add generating enemy
//        while (pc.getCurrentHealth() > 0 && enemy.getCurrentHealth() > 0){
//            //Round of combat
//            String pcADU = getADU();
//            String npcADU = generateADU(enemy);
//            String result = Attack.round(pc, pcADU, enemy, npcADU);
//            pc.incrementUnleashRoundTracker(pcADU);
//            enemy.incrementUnleashRoundTracker(npcADU);
//
//            op.combatRound(pc,enemy,result);
//            if (pc.getCurrentHealth() <= 0){
//                System.out.println();
//                System.out.println(OutputAscii.generateSpaces(35) + "Unfourtunatly, " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() + OutputAscii.RESET +
//                        " has been defeated by " + OutputAscii.RED_BOLD_BRIGHT + enemy.getName() + OutputAscii.RESET + "!");
//            }
//            if (enemy.getCurrentHealth() <= 0){
//                System.out.println();//Congratulations
//                System.out.println(OutputAscii.generateSpaces(35) + "Congratulations! " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() + OutputAscii.RESET +
//                        " has defeated " + OutputAscii.RED_BOLD_BRIGHT + enemy.getName() + OutputAscii.RESET + "!");
//            }
//
//        }

        //upgrade method
        // What would you like to upgrade?
        // 1) Head
        // 2) Body
        // 3) Sword
        // 4) Shield

        // error input
        //System.out.println(OutputAscii.generateSpaces(120) + "Please enter [A], [D], or [U]: ");




    }

    public static void startup(){
        op.printAsciiTitle();
        System.out.print( op.generateSpaces(45)+"Name your gladiator: ");
        pc.setName(input.nextLine());
        pc.setMight(rollDice(10) +5);

    }
    public static boolean isPCVictorious(Person enemy){
        boolean isPCWinner = false;
        System.out.println(OutputAscii.generateSpaces(40) + "Welcome, " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() +OutputAscii.RESET +
                ", you'll be facing " + OutputAscii.RED_BOLD_BRIGHT + enemy.getName() + OutputAscii.RESET + "!");
        System.out.println("");
        op.printArena(pc.spriteGen(), OutputAscii.CYAN_BOLD_BRIGHT, enemy.spriteGen(),OutputAscii.RED_BOLD_BRIGHT);
        op.startCombat(pc,enemy);
        while (pc.getCurrentHealth() > 0 && enemy.getCurrentHealth() > 0){
            //Round of combat
            String pcADU = getADU();
            String npcADU = generateADU(enemy);
            String result = Attack.round(pc, pcADU, enemy, npcADU);
            pc.incrementUnleashRoundTracker(pcADU);
            enemy.incrementUnleashRoundTracker(npcADU);

            op.combatRound(pc,enemy,result);
            if (pc.getCurrentHealth() <= 0){
                System.out.println();
                System.out.println(OutputAscii.generateSpaces(35) + "Unfourtunatly, " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() + OutputAscii.RESET +
                        " has been defeated by " + OutputAscii.RED_BOLD_BRIGHT + enemy.getName() + OutputAscii.RESET + "!");

            }
            if (enemy.getCurrentHealth() <= 0){
                System.out.println();//Congratulations
                System.out.println(OutputAscii.generateSpaces(35) + "Congratulations! " + OutputAscii.CYAN_BOLD_BRIGHT + pc.getName() + OutputAscii.RESET +
                        " has defeated " + OutputAscii.RED_BOLD_BRIGHT + enemy.getName() + OutputAscii.RESET + "!");
                isPCWinner = true;
            }

        }
        return isPCWinner;

    }
    public static void upgradeStore(boolean isPCWinner){
        boolean isNotValidInput = true;
        if(storeList.size() == 0){
            System.out.println("There are no more upgrades!");
        } else{
            System.out.println(op.generateSpaces(45) + "What would you like to upgrade?");
            for(String category : storeList){
                System.out.println(op.generateSpaces(45) + (storeList.indexOf(category)+1) + ") " + category);
            }
            while (isNotValidInput){
                String upgradeNumber = input.next();
                if(isInteger(upgradeNumber) && Integer.parseInt(upgradeNumber) > 0 && Integer.parseInt(upgradeNumber) < storeList.size()){
                    String selection = storeList.get(Integer.parseInt(upgradeNumber));
                    if( selection == "Head"){
                        int level = pc.getCurrentLoadout().getHead().getDamageReduction();


                    } else if(selection == "Body"){

                    }
                    isNotValidInput = false;

                } else{
                    System.out.println("Please enter a valid number");
                }
            }

        }
//        System.out.println(op.generateSpaces(45) + "1) Head");
//        System.out.println(op.generateSpaces(45) + "2) Body");
//        System.out.println(op.generateSpaces(45) + "3) Sword");
//        System.out.println(op.generateSpaces(45) + "4) Shield");
    }

    public static String getADU(){
        boolean isNotValidInput = true;
        System.out.print("     [A]ttack, [D]efend, or [U]nleash? ");
        while (isNotValidInput){
            String adu = input.next();
            if(isADU(adu, pc)){
                isNotValidInput = false;
                return adu;
            } else {
                System.out.println(OutputAscii.generateSpaces(120) + "Please use valid input");
                System.out.print(OutputAscii.generateSpaces(120) + "     [A]ttack, [D]efend, or [U]nleash? ");
            }
        }
        return "d";
    }

    public static boolean isInteger(String input){
        boolean isInt = true;
        List<String> numbers = new ArrayList<>();
        numbers.add("0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");
        for (String character : input.split("")){
            if(!numbers.contains(character)){
                isInt = false;
            }
        }
        return isInt;
    }
    public static boolean isAlphabet(String input){
        boolean isAlpha = true;
        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");
        letters.add("j");
        letters.add("k");
        letters.add("l");
        letters.add("m");
        letters.add("n");
        letters.add("o");
        letters.add("p");
        letters.add("q");
        letters.add("r");
        letters.add("s");
        letters.add("t");
        letters.add("u");
        letters.add("v");
        letters.add("w");
        letters.add("x");
        letters.add("y");
        letters.add("z");
        for ( String character : input.split("")){
            if(!letters.contains(character.toLowerCase())){
                isAlpha = false;
                break;
            }
        }

        return isAlpha;
    }
    public static boolean isYN(String input){
        boolean isYn = true;
        List<String> listYN = new ArrayList<>();
        listYN.add("y");
        listYN.add("n");
        for ( String character: input.split("")){
            if (!listYN.contains(character.toLowerCase())){
                isYn = false;
                break;
            }
        }
        return isYn;
    }
    public static boolean isInputLength1(String input){
        return input.length() == 1;
    }
    public static boolean isADU(String input, Person pc){
        boolean isADU = true;
        List<String> listADU = new ArrayList<>();
        listADU.add("a");
        listADU.add("d");
        if(pc.getUnleashRoundTracker() == 0){
            listADU.add("u");
        }

        for (String character : input.split("")){
            if (!listADU.contains(character.toLowerCase())){
                isADU = false;
                break;
            }
        }
        return isADU;
    }
    public static String generateADU(Person npc){
        List<String> listADU = new ArrayList<>();
        listADU.add("a");
        listADU.add("d");
        if(npc.getUnleashRoundTracker() == 0){
            listADU.add("u");

        }
        Collections.shuffle(listADU);
        return listADU.get(0);
    }

    public static int rollDice(int diceSize){
        List<Integer> die = new ArrayList<>();
        for(int i= 1; i <= diceSize; i++){
            die.add(i);
        }
        Collections.shuffle(die);
        return die.get(0);
    }
    public static String nameGenerator(){
        List<String> names = Arrays.asList("Joe",
                "Bill",
                "Maximus",
                "Hector",
                "Achilles",
                "Ethel",
                "Chris",
                "Tactus",
                "Cassius",
                "Crixus",
                "Barca",
                "Thanatos");
        Collections.shuffle(names);
        return names.get(0);
    }
    public static Person npcGenerator(int modifier){
        Person npc = new Person();
        npc.setName(nameGenerator());
        Equipment npcEquipment = new Equipment();
        int diceRoll = rollDice(2) - 1; //cuz head list is from 0 to 1
        npcEquipment.setHead(new Head(Equipment.getHeadTracker().get(diceRoll),diceRoll));
        diceRoll = modifier >= 4 ?
                3:
                modifier;
        npcEquipment.setBody(new Body(Equipment.getBodyTracker().get(diceRoll),diceRoll));
        diceRoll = modifier + (rollDice(2)-1); //rollDice(4);
        npcEquipment.setLeftHand(new Sword(Equipment.getLhSwordTracker().get(diceRoll), diceRoll) );
        diceRoll = modifier+ (rollDice(2)-1);//rollDice(4);
        npcEquipment.setRightHand(new Shield(Equipment.getShieldTracker().get(diceRoll), diceRoll) );

        npc.setCurrentLoadout(npcEquipment);
        npc.setMight(rollDice(10)+roundNumber);

        return npc;
    }

}