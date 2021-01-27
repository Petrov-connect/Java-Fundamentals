package Methods;
//created by J.M.

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        printTheMiddleCharacter(input);
    }

    private static void printTheMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            System.out.println(input.charAt(input.length() / 2 - 1) + "" + input.charAt(input.length() / 2));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
