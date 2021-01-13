package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int yield = Integer.parseInt(scan.nextLine());

        int days = 0;
        int total = 0;

        while (yield >= 100) {
            days++;
            total += yield - 26;
            yield -= 10;
        }
        System.out.println(days);
        if (total >= 26) {
            total -= 26;
        }
        System.out.println(total);
    }
}
