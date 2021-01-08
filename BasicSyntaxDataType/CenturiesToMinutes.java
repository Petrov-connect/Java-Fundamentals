package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class CenturiesToMinutes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int centuries = Integer.parseInt(scan.nextLine());

        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        long minutes = hours * 60L;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);
    }
}
