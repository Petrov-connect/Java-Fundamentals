package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class DisneylandJourney {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scan.nextLine());
        int mont = Integer.parseInt(scan.nextLine());

        double saveMoney = 0;

        for (int i = 1; i <= mont; i++) {
            if (i % 4 == 0) {
                saveMoney *= 1.25;
            }
            if (i != 1 && i % 2 != 0) {
                saveMoney *= 0.84;
            }
            saveMoney += neededMoney * 0.25;
        }
        if (saveMoney >= neededMoney) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", saveMoney - neededMoney);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", Math.abs(saveMoney - neededMoney));
        }
    }
}
