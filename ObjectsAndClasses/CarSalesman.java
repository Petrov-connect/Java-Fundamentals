package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class CarSalesman {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nextLines = Integer.parseInt(scan.nextLine());
        List<Engine> engineList = new ArrayList<>();

        while (nextLines-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            String displacement = "n/a";
            String efficiency = "n/a";
            if (input.length == 3) {
                try {
                    Integer.parseInt(input[2]);
                    displacement = input[2];
                } catch (Exception exception) {
                    efficiency = input[2];
                }
            } else if (input.length == 4) {
                displacement = input[2];
                efficiency = input[3];
            }
            Engine newData = new Engine(input[0], input[1], displacement, efficiency);
            engineList.add(newData);
        }

        nextLines = Integer.parseInt(scan.nextLine());
        List<Car> carList = new ArrayList<>();

        while (nextLines-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            String weight = "n/a";
            String color = "n/a";
            if (input.length == 3) {
                try {
                    Integer.parseInt(input[2]);
                    weight = input[2];
                } catch (Exception exception) {
                    color = input[2];
                }
            } else if (input.length == 4) {
                weight = input[2];
                color = input[3];
            }
            Engine dataEngine = engineList.stream().filter(data -> data.getModel().equals(input[1])).findFirst().orElseThrow();
            Car newData = new Car(input[0], dataEngine, weight, color);
            carList.add(newData);
        }

        carList.forEach(System.out::println);
    }

    static class Car {
        String model;
        Engine engine;
        String weight;
        String color;

        Car(String model, Engine engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        String getModel() {
            return model;
        }

        Engine getEngine() {
            return engine;
        }

        String getWeight() {
            return weight;
        }

        String getColor() {
            return color;
        }

        public String toString() {
            Engine engine = this.getEngine();
            return String.format("%s:%n%s%nWeight: %s%nColor: %s", getModel(), engine.toString(), getWeight(), getColor());
        }
    }

    static class Engine {
        String model;
        String power;
        String displacement;
        String efficiency;

        Engine(String model, String power, String displacement, String efficiency) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        String getModel() {
            return model;
        }

        String getPower() {
            return power;
        }

        String getDisplacement() {
            return displacement;
        }

        String getEfficiency() {
            return efficiency;
        }

        public String toString() {
            return String.format("%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s", getModel(), getPower(), getDisplacement(), getEfficiency());
        }

    }
}

