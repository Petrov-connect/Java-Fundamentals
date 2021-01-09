package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class FloatingEquality {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        if (Math.abs(a - b) < 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
    