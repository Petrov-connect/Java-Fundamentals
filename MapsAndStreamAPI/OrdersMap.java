package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class OrdersMap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, double[]> products = new LinkedHashMap<>();
        String input;

        while (!"buy".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            if (!products.containsKey(command[0])) {
                products.put(command[0], new double[2]);
            }
            products.put(command[0], setArray(Double.parseDouble(command[1]), Double.parseDouble(command[2]),
                    products.get(command[0])));
        }
        products.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, getMultiple(value)));
    }

    static double[] setArray(double price, double quantity, double[] array) {
        double[] newArray = new double[2];
        newArray[0] = price;
        newArray[1] = array[1] + quantity;
        return newArray;
    }

    static double getMultiple(double[] array) {
        return array[0] * array[1];
    }
}
