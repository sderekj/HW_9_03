package nyc.c4q.dereksantos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log("Please enter your name.");
        String name = scanner.next();
        log("Hello, " + name + "!\n\n\n");

        Introduction.intro();
        log("Do you want to say your morning coffee prayer? (Make sure you enter Y for yes and N for no.)");
        boolean isValidInput;
        do {
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("y")) {
                isValidInput = true;
                CoffeePrayer.coffeePrayer();
            } else if (userAnswer.equals("n")) {
                isValidInput = true;
                log("Eh, you're right. Why say a coffee prayer, anyway?");
            } else {
                isValidInput = false;
                log("Sorry, I didn't understand that. Can you please try again. (Remember, enter Y for yes or N for no.");
            }
        } while (!isValidInput);
        log("\n\n");
        NoMoreMilk.noMoreMilk();
        log("Will you:\nA) Go to the store to buy some milk?\nB) Ask your neighbor JSmoove for some milk.\n(please enter a letter only)");
        boolean isValidInput2;
        do {
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer.equals("a")) {
                isValidInput2 = true;
                Store.talkToTony();
            } else if (userAnswer.equals("b")) {
                isValidInput2 = true;
                JSmoove.talkToJSmoove();
            } else {
                isValidInput2 = false;
                System.out.println("Sorry, I didn't understand that. Try entering A or B.");
            }
        } while (!isValidInput2);

        log("Do you want to play his game? Yes or No?");
        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.next();
        userAnswer = userAnswer.toLowerCase();
        if (userAnswer.equals("y")) {
            Game.theGame();
        } else {
            log("Uh oh, bad choice! You're so addicted to coffee that going without it for a morning" +
                    "has caused you to die.\n\n\n" +
                    "go throughout the day without your morning coffee)\n" +
                    "              __.....__\n" +
                    "            .'         ':,\n" +
                    "           /  __  _  __  \\\\\n" +
                    "           | |_)) || |_))||\n" +
                    "           | | \\ || |   ||\n" +
                    "           |             ||   _,\n" +
                    "           |             ||.-(_{}\n" +
                    "           |             |/    `\n" +
                    "           |        ,_ (\\;|/)\n" +
                    "         \\\\|       {}_)-,||`\n" +
                    "         \\\\;/,,;;;;;;;,\\\\|//,\n" +
                    "        .;;;;;;;;;;;;;;;;,\n" +
                    "       \\,;;;;;;;;;;;;;;;;,//\n" +
                    "      \\\\;;;;;;;;;;;;;;;;,//\n" +
                    "     ,\\';;;;;;;;;;;;;;;;'\n" +
                    "    jgs;;;;;;;;;;;'''`");
        }
    }




    // Helper function that does the same thing as System.out.println
    public static void log(String input) {
        System.out.println(input);
    }
}
