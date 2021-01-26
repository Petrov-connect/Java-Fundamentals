package Methods;
//created by J.M.

import java.util.Scanner;

public class CharactersInRange {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char last = scan.nextLine().charAt(0);

        printCharactersBetween(first, last);
    }

    private static void printCharactersBetween(char first, char last) {
        for (char a = (char) Math.min(first, last); a < Math.max(first, last) - 1; a++) {
            System.out.printf("%c ", a + 1);
        }
    }
}
