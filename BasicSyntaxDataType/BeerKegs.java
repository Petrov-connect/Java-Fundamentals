package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String biggest = "";
        double volume = 0;

        for (int i = 1; i <= n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volumeKeg = Math.PI * radius * radius * height;
            if (volumeKeg > volume) {
                volume = volumeKeg;
                biggest = model;
            }
        }
        System.out.println(biggest);
    }
}
