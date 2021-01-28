package Methods;
//created by J.M.

import java.util.Scanner;

public class SignOfIntegerNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.printf("The number %d is %s.", n, getSign(n));
    }

    static String getSign(int n) {
        String output;
        if (n > 0) {
            output = "positive";
        } else if (n < 0) {
            output = "negative";
        } else {
            output = "zero";
        }
        return output;
    }
}
