package Methods;
//created by J.M.

import java.util.Scanner;

public class DataType2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("END")) {
            boolean isInt = false;
            boolean isDouble = false;
            int count = 0;
            int dot = 0;
            for (int i = 0; i < input.length(); i++) {
                char n = input.charAt(i);
                if (n > 47 && n < 58) {
                    count++;
                } else if (n == 46) {
                    dot++;
                } else if (i == 0 && n == 45) {
                    count++;
                }
                if (count == input.length()) {
                    isInt = true;
                } else if ((count + 1 == input.length()) && dot == 1) {
                    isDouble = true;
                }
            }
            if (isInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if ("true".equalsIgnoreCase(input) || "false".equalsIgnoreCase(input)) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scan.nextLine();
        }
    }
}
