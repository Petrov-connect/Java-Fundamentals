package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class TheatrePromotion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine().toLowerCase();
        int age = Integer.parseInt(scan.nextLine());

        int price;

        switch (day) {
            case "weekday":
                if (0 <= age && age <= 18 || 64 < age && age <= 122) {
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                } else {
                    price = -1;
                }
                break;
            case "weekend":
                if (0 <= age && age <= 18 || 64 < age && age <= 122) {
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                } else {
                    price = -1;
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else if (64 < age && age <= 122) {
                    price = 10;
                } else {
                    price = -1;
                }
                break;
            default:
                price = -1;
                break;
        }
        if (!(price == -1)) {
            System.out.println(price + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
