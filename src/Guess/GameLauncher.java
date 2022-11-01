package Guess;

import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        boolean stop = false;
        while(!stop) {
            //do whatever
            Player player1 = new Player();
            System.out.println(player1.play());

            System.out.println("Press n if you like to stop? (y or n)");
            //String s = ScannernextLine();
            Scanner sc = new Scanner(System.in);
            String s = sc.toString();
            if(s.equals("n")) {
                stop = true;
            }
        }

    }
}
