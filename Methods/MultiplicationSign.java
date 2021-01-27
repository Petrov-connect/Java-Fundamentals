package Methods;
//created by J.M.

import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if ((num1 > 0 && num2 > 0 && num3 > 0) || (num1 < 0 && num2 < 0 && num3 > 0) || (num1 < 0 && num2 > 0 && num3 < 0)
                || (num1 > 0 && num2 < 0 && num3 < 0)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
