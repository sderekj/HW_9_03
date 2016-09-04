package nyc.c4q.dereksantos;

import java.util.Scanner;

public class Game {

    public static void theGame() {
        System.out.println("All you have to do is finish off the lyrics to this song. Ready?\n");
        System.out.println("In west __________ born and raised\n" +
                "\"On the playground was where I spent most of my days\"" +
                "\nWhat's the name of the city?\nIs it:\nA) Oakland\nB) Chicago\nC) Philadelphia\n(Enter a letter.)");

        boolean isValidInput = false;
        do {
            Scanner answer = new Scanner(System.in);
            String userAnswer = answer.next();
            userAnswer = userAnswer.toLowerCase();
            switch (userAnswer) {
                case "a":
                    System.out.println("Oakland? Uh, I don't think so. No milk for you!");
                    isValidInput = true;
                    break;
                case "b":
                    System.out.println("Chicago is definitely not it. No milk for you!");
                    isValidInput = true;
                    break;
                case "c":
                    System.out.println("Correct! You get to walk out with the milk for free!");
                    isValidInput = true;
                    break;
                default:
                    System.out.println("I don't even know what that means. Try entering A, B, or C.");
            }
        } while (!isValidInput);


    }



}
