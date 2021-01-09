package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scan.nextLine());
        }
        if (Math.abs(num) % 2 == 0) {
            System.out.println("The number is: " + Math.abs(num));
        }
    }
}
