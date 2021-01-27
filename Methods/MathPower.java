package Methods;
//created by J.M.

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int powerNumber = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(MathPowerNumber(number, powerNumber)));
    }

    static double MathPowerNumber(double number, int powerNumber) {
        return Math.pow(number, powerNumber);
    }
}