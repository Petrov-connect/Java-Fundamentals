package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NeedForSpeed {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, int[]> carInfo = IntStream.range(0, n).mapToObj(i -> scan.nextLine().split("\\|"))
                .collect(Collectors.toMap(input -> input[0], input -> new int[]{Integer.parseInt(input[1])
                        , Integer.parseInt(input[2])}, (a, b) -> b, TreeMap::new));
        String input;

        while (!"Stop".equals(input = scan.nextLine())) {
            String[] command = input.split(" : ");
            String car = command[1];
            switch (command[0]) {
                case "Drive":
                    int distance = Integer.parseInt(command[2]);
                    int fuel = Integer.parseInt(command[3]);
                    if (carInfo.get(car)[1] < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carInfo.get(car)[0] += distance;
                        carInfo.get(car)[1] -= fuel;
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    if (carInfo.get(car)[0] > 100000) {
                        carInfo.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(command[2]);
                    if (carInfo.get(car)[1] + refuel > 75) {
                        refuel = 75 - carInfo.get(car)[1];
                    }
                    carInfo.get(car)[1] += refuel;
                    System.out.printf("%s refueled with %d liters%n", car, refuel);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(command[2]);
                    if (carInfo.get(car)[0] - kilometers < 10000) {
                        carInfo.get(car)[0] = 10000;
                    } else {
                        carInfo.get(car)[0] -= kilometers;
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    break;
            }
        }
        carInfo.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue()[0], a.getValue()[0]))
                .forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                        , e.getKey(), e.getValue()[0], e.getValue()[1]));
    }
}
