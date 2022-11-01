package Guess;

import java.util.Scanner;

public class Player {

    public boolean play(){
        GuessNumberGame guess = new GuessNumberGame();
        int numberGenerated = guess.getNumberToGuess();
        System.out.println("enter your guess between 1 to 10");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Number generated is "+numberGenerated);
        if(input == numberGenerated) return true;
        else return false;
    }
}
