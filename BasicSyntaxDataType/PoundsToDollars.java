package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class PoundsToDollars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double pounds = scan.nextDouble();

        System.out.printf("%.3f", pounds * 1.31);
    }
}
