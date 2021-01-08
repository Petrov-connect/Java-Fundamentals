package BasicSyntaxDataType;
//created by J.M.

import java.util.*;

public class CookingMasterclass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double total = (apronPrice * (Math.ceil(students * 1.2))) + (eggPrice * 10 * students)
                + (flourPrice * (students - (Math.floor((double) students / 5))));

        if (total <= budget) {
            System.out.printf("Items purchased for %.02f$.", total);
        } else {
            System.out.printf("%.02f$ more needed.", total - budget);
        }
    }
}