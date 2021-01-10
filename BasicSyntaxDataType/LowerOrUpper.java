package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class LowerOrUpper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char input = scan.nextLine().charAt(0);

        if (input > 64 && input < 91) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
