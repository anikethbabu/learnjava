import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SmashClass {
    // creates new objects of the GameCharacter class and stores them in a array
    static GameCharacter[] characters = {
            new GameCharacter("Sonic", "homing attack", "spin dash", "spin charge"),
            new GameCharacter("Lucina", "shield breaker", "dancing blade", "counter"),
            new GameCharacter("Mario", "super jump punch", "super kick", "cape"),
            new GameCharacter("Donkey Kong", "giant punch", "spinning kong", "headbutt"),
            new GameCharacter("Link", "jab", "slash", "boomerang "),
            new GameCharacter("Samus", "bomb", "missile", "screw attack"),
            new GameCharacter("Ganondorf", "warlock punch", "wizards foot", "flame choke"),
            new GameCharacter("Fox", "fire fox", "fox illusion", "reflector")
    };

    public static void main(String[] args) {
        int chooseCharacter = chooseCharacter();
        int computerCharacter = randomCharacter();

        battle(chooseCharacter, computerCharacter);
    }

    private static String getMove(int characterNumber, String characterMove) {
        GameCharacter character = characters[characterNumber];
        switch (characterMove) {
            case "p" :
                return character.punch;
            case "k" :
                return character.kick;
        }
        return character.counter;
    }

    private static int chooseCharacter() {
        int character = 0;
        for (int i = 0; i < characters.length; i++) {
            System.out.println(i + " " + characters[i].name);
        }
        while (true) {
            System.out.println("Select a Character (0-7): ");
            Scanner charactersc = new Scanner(System.in);
            try {
                character = charactersc.nextInt();
            }
            catch (InputMismatchException a)
            {
                System.out.println("Please Enter an Integer");
            }
            if (character == 0 || character == 1 ||character == 2 ||character == 3 ||character == 4 ||character == 5 ||character == 6 ||character == 7) {
                break;
            }
            else{
                System.out.println("Invalid Enter a number 0-7");
            }
        }
        return character;
    }




    public static String inputUserMove() {
        String userInput;

        label:
        while (true) {
            System.out.print("Enter your move: ");
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextLine();

            switch (userInput) {
                case "k":
                case "p":
                case "c":
                    break label;
                default:
                    System.out.println("You have entered an invalid move");
                    System.out.println("Choose p for Punch, k for kick, or c for Counter");
                    break;
            }
        }
        return userInput;
    }


    public static int randomCharacter() {
        Random rand = new Random();
        return rand.nextInt(7);
    }

    public static String computerMove() {
        String computerInput = null;
        Random rand = new Random();
        int random123 = rand.nextInt(3);
        if (random123 == 0) {
            computerInput = "k";
        } else if (random123 == 1) {
            computerInput = "p";
        } else if (random123 == 2) {
            computerInput = "c";
        }

        return computerInput;
    }

    public static void battle(int userCharacter, int computerCharacter) {
        int playerLives = 3;
        int computerLives = 3;
        System.out.println("You have selected " + characters[userCharacter].name);
        System.out.println("The computer has selected "+ characters[computerCharacter].name);
        System.out.println("Directions: Enter p for punch, kick for kick, and c for counter.");
        System.out.println("Punch beats Counter, Counter beats Kick, and Kick beats Punch");
        System.out.println("Your Moves: " + "Punch = " + characters[userCharacter].punch + "," +" Kick = " + characters[userCharacter].kick + "," +" Counter = " + characters[userCharacter].counter );


        while (playerLives > 0 && computerLives > 0) {

            String playerInput = inputUserMove();
            System.out.println("Player: " + characters[userCharacter].name + " is using "+ getMove(userCharacter, playerInput)+ "(" + playerInput +")");

            String computerInput = computerMove();
            System.out.println("Computer: "+ characters[computerCharacter].name + " is using " + getMove(computerCharacter, computerInput)+ "(" + computerInput + ")");

            if (playerInput.equals(computerInput)) {
                System.out.println("Draw.");
                statPrint(playerLives, computerLives);
            } else if (playerInput.equals("p")) {
                if (computerInput.equals("c")) {
                    winPrint();
                    computerLives = computerLives - 1;
                    statPrint(playerLives, computerLives);
                } else if (computerInput.equals("k")) {
                    lossPrint();
                    playerLives = playerLives - 1;
                    statPrint(playerLives, computerLives);
                }
            } else if (playerInput.equals("k")) {
                if (computerInput.equals("p")) {
                    winPrint();
                    computerLives = computerLives - 1;
                    statPrint(playerLives, computerLives);
                } else if (computerInput.equals("c")) {
                    lossPrint();
                    playerLives = playerLives - 1;
                    statPrint(playerLives, computerLives);
                }
            } else if (playerInput.equals("c")) {
                if (computerInput.equals("p")) {
                    lossPrint();
                    playerLives = playerLives - 1;
                    statPrint(playerLives, computerLives);
                } else if (computerInput.equals("k")) {
                    winPrint();
                    computerLives = computerLives - 1;
                    statPrint(playerLives, computerLives);
                }

            }
        }
        if (computerLives == 0){
            System.out.println("You Won the Game");
        }
        else
        {
            System.out.println("You Lost the Game");
        }
    }

    private static void statPrint(int playerLives, int computerLives) {
        System.out.println("Your lives: " + playerLives);
        System.out.println("Enemy lives: " + computerLives);
    }

    public static void winPrint() {
        System.out.println("You won the round");
    }

    public static void lossPrint() {
        System.out.println("You lost the round");
    }

}

class GameCharacter {
    String name;
    String punch;
    String kick;
    String counter;

    public GameCharacter(String name, String punch, String kick, String counter) {
        this.name = name;
        this.punch = punch;
        this.kick = kick;
        this.counter = counter;
    }

}
