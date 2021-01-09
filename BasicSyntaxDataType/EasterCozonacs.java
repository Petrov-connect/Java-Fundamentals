package BasicSyntaxDataType;
//created by J.M.

import java.util.*;

public class EasterCozonacs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double priceFlour = Double.parseDouble(scan.nextLine());

        double priceEgg = priceFlour * 0.75;
        double priceMilk = priceFlour * 1.25;
        double priceForOne = priceEgg + priceFlour + priceMilk / 4;
        int cozonacs = 0;
        int colorEggs = 0;

        while (budget >= priceForOne) {
            cozonacs++;
            colorEggs += 3;
            if (cozonacs % 3 == 0) {
                colorEggs -= cozonacs - 2;
            }
            budget -= priceForOne;
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.", cozonacs, colorEggs, budget);
    }
}
