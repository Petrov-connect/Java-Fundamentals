package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double totalPrice = 0;
        double price = 0;

        switch (type) {
            case "ObjectsAndClasses.Students":
                switch (day) {
                    case "Friday": price = 8.45;   break;
                    case "Saturday": price = 9.80; break;
                    case "Sunday": price = 10.46;  break;
                }
                totalPrice = price * num;
                if (num >= 30) {
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday": price = 10.90;   break;
                    case "Saturday": price = 15.60; break;
                    case "Sunday": price = 16.00;   break;
                }
                if (num >= 100) {
                    num -= 10;
                }
                totalPrice = price * num;
                break;
            case "Regular":
                switch (day) {
                    case "Friday": price = 15.00;   break;
                    case "Saturday": price = 20.00; break;
                    case "Sunday": price = 22.50;   break;
                }
                totalPrice = price * num;
                if (num >= 10 && num <= 20) {
                    totalPrice *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
