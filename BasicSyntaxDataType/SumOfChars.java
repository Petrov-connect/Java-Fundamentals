package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class SumOfChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += scan.nextLine().charAt(0);
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
