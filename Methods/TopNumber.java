package Methods;
//created by J.M.

import java.util.Scanner;

public class TopNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printAllTopNumbers(n);
    }

    private static void printAllTopNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int checkNum = i;
            boolean odd = false;
            while (checkNum > 0) {
                int lastDigit = checkNum % 10;
                if ((lastDigit % 2 != 0)) {
                    odd = true;
                }
                sum += lastDigit;
                checkNum /= 10;
            }
            if ((sum % 8 == 0) && (odd)) {
                System.out.println(i);
            }
        }
    }
}
