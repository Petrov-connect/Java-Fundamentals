package TextProcessing;
//created by J.M.

import java.util.*;

public class AsciiSumator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char first = (scan.nextLine().charAt(0));
        char second = (scan.nextLine().charAt(0));
        String input = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > Math.min(first, second) && input.charAt(i) < Math.max(first, second)) {
                sum += input.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
