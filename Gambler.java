import java.util.Scanner;

public class Gambler { 

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter your stake: ");
        int stake  = in.nextInt();    // gambler's stating bankroll
        System.out.println("Enter your goal amount: ");
        int goal   = in.nextInt();    // gambler's desired bankroll
        System.out.println("Enter the number of trials: ");
        int trials = in.nextInt();    // number of trials to perform
        System.out.println();
        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won
        int losses = 0;

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
            else losses++;
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println(losses + " losses of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}