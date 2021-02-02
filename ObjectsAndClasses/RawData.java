package ObjectsAndClasses;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class RawData {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> carList = new ArrayList<>();

        while (n-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            Car data = new Car(input[0], Integer.parseInt(input[2]), input[4], Double.parseDouble(input[5])
                    , Double.parseDouble(input[7]), Double.parseDouble(input[9]), Double.parseDouble(input[11]));
            carList.add(data);
        }
        String input = scan.nextLine();
        if (input.equals("fragile")) {
            IntStream.range(0, carList.size()).filter(i -> carList.get(i).getCargoType().equals("fragile")
                    && carList.get(i).tirePressure()).mapToObj(i -> carList.get(i).getModel()).forEach(System.out::println);
        } else {
            IntStream.range(0, carList.size()).filter(i -> carList.get(i).getCargoType().equals("flamable")
                    && carList.get(i).getEnginePower() > 250).mapToObj(i -> carList.get(i).getModel()).forEach(System.out::println);
        }
    }

    static class Car {
        String model;
        int enginePower;
        String cargoType;
        double tire1;
        double tire2;
        double tire3;
        double tire4;

        Car(String model, int enginePower, String cargoType, double tire1, double tire2, double tire3, double tire4) {
            this.model = model;
            this.enginePower = enginePower;
            this.cargoType = cargoType;
            this.tire1 = tire1;
            this.tire2 = tire2;
            this.tire3 = tire3;
            this.tire4 = tire4;
        }

        Boolean tirePressure() {
            return getTire1() < 1 || getTire2() < 1 || getTire3() < 1 || getTire4() < 1;
        }

        String getModel() {
            return model;
        }

        String getCargoType() {
            return cargoType;
        }

        int getEnginePower() {
            return enginePower;
        }

        double getTire1() {
            return tire1;
        }

        double getTire2() {
            return tire2;
        }

        double getTire3() {
            return tire3;
        }

        double getTire4() {
            return tire4;
        }
    }
}