package MidExam;
//created by J.M.

import java.util.*;

public class CounterStrike {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int energy = Integer.parseInt(scan.nextLine());
        String input;
        int countWon = 0;

        while (!"End of battle".equals(input = scan.nextLine())) {
            int distance = Integer.parseInt(input);
            if (energy - distance < 0) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWon, energy);
                return;
            } else {
                energy -= distance;
                countWon++;
            }
            if (countWon % 3 == 0) {
                energy += countWon;
            }
        }
        System.out.printf("Won battles: %d. Energy left: %d", countWon, energy);
    }
}
