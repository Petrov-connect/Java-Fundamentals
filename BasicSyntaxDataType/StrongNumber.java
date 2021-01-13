package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int number = Integer.parseInt(num);

        int totalSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int n = Integer.parseInt(String.valueOf((num).charAt(i)));
            int sum = 1;
            for (int j = 1; j <= n; j++) {
                sum *= j;
            }
            totalSum += sum;
        }
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
