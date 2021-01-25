package Methods;
//created by J.M.

import java.util.Scanner;

public class AddAndSubtract {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println(subtract(sum(num1, num2), num3));
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

}



