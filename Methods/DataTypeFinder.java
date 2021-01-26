package Methods;
//created by J.M.

import java.util.Scanner;

public class DataTypeFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("END")) {
            Scanner newInput = new Scanner(input);
            if (newInput.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            } else if (newInput.hasNextInt()) {
                System.out.printf("%s is integer type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (newInput.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scan.nextLine();
        }
    }
}