package Methods;
//created by J.M.

import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println(findSmallestNumber(num1, num2, num3));
    }

    private static int findSmallestNumber(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
