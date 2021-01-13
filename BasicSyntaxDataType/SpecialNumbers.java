package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++) {
            String digit = "" + i;
            int sum = 0;
            for (int j = 0; j < digit.length(); j++) {
                sum += Integer.parseInt(String.valueOf((digit).charAt(j)));
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
