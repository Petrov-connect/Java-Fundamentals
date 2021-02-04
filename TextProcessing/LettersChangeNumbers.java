package TextProcessing;
//created by J.M.

import java.util.*;

public class LettersChangeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");

        double sum = 0;

        for (String s : input) {
            double number = Double.parseDouble(s.substring(1, s.length() - 1));
            int first = (Character.toLowerCase(s.charAt(0)) - 97) + 1;
            if (Character.isUpperCase(s.charAt(0))) {
                sum += number / first;
            } else {
                sum += number * first;
            }
            int last = (Character.toLowerCase(s.charAt(s.length() - 1)) - 97) + 1;
            if (Character.isUpperCase(s.charAt(s.length() - 1))) {
                sum -= last;
            } else {
                sum += last;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
