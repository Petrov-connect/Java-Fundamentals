package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lostGame = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double total = Math.floor(lostGame / 2.0) * headsetPrice + Math.floor(lostGame / 3.0) * mousePrice +
                Math.floor(lostGame / 6.0) * keyboardPrice + Math.floor(lostGame / 12.0) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
