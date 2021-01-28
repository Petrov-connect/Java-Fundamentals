package MidExam;
//created by J.M.

import java.util.*;

public class ComputerStore {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double priceSum = 0;
        String input = scan.nextLine();

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                priceSum += price;
            }
            input = scan.nextLine();
        }
        double taxes = priceSum * 0.2;
        double totalPrice = priceSum + taxes;
        if (input.equals("special")) {
            totalPrice *= 0.9;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n" +
                    "-----------%nTotal price: %.2f$", priceSum, taxes, totalPrice);
        }
    }
}
