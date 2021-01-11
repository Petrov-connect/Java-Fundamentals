package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double moneyHave = Double.parseDouble(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());
        double priceLightSabers = Double.parseDouble(scan.nextLine());
        double priceRobe = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());

        double totalRobe = countStudents * priceRobe;
        double totalBelt;

        if (countStudents >= 6) {
            totalBelt = (countStudents - Math.floor(countStudents / 6.0)) * priceBelt;
        } else {
            totalBelt = countStudents * priceBelt;
        }

        double totalLightSaber = (countStudents + Math.ceil(countStudents * 0.1)) * priceLightSabers;
        double totalPrice = totalLightSaber + totalRobe + totalBelt;

        if (totalPrice <= moneyHave) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalPrice - moneyHave);
        }
    }
}

