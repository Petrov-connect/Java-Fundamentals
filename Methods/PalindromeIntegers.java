package Methods;
//created by J.M.

import java.util.Scanner;

public class PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("END")) {
            checkForPalindrome(input);
            input = scan.nextLine();
        }
    }

    private static void checkForPalindrome(String input) {

        StringBuilder reverseInput = new StringBuilder(input);
        reverseInput.reverse();
        if (input.contentEquals(reverseInput)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
