package BasicSyntaxDataType;
//created by J.M.

import java.util.*;

public class SpringVacationTrip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double fuelPerKilometer = Double.parseDouble(scan.nextLine());
        double foodPricePerPersonDay = Double.parseDouble(scan.nextLine());
        double priceForRoomPerPerson = Double.parseDouble(scan.nextLine());

        double hotelForGroup = priceForRoomPerPerson * people * days;

        if (people > 10) {
            hotelForGroup *= 0.75;
        }
        double expenses = (hotelForGroup) + (foodPricePerPersonDay * people * days);
        for (int i = 1; i <= days; i++) {
            expenses += Integer.parseInt(scan.nextLine()) * fuelPerKilometer;
            if (i % 3 == 0 || i % 5 == 0) {
                expenses *= 1.4;
            }
            if (i % 7 == 0) {
                expenses -= expenses / people;
            }
            if (expenses > budget) {
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", expenses - budget);
                return;
            }
        }
        System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - expenses);
    }
}
