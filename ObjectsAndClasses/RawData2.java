package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class RawData2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]), input[4]);
            Tire tire1 = new Tire(Double.parseDouble(input[5]), Integer.parseInt(input[6]));
            Tire tire2 = new Tire(Double.parseDouble(input[7]), Integer.parseInt(input[8]));
            Tire tire3 = new Tire(Double.parseDouble(input[9]), Integer.parseInt(input[10]));
            Tire tire4 = new Tire(Double.parseDouble(input[11]), Integer.parseInt(input[12]));
            Car car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            carList.add(car);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            carList.stream().filter(e -> e.getCargo().getType().equals("fragile")).forEach(e -> {
                Tire[] tires = e.getTires();
                if (Arrays.stream(tires).anyMatch(tireSet -> tireSet.getPressure() < 1)) {
                    System.out.println(e.getModel());
                }
            });

        } else {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("flamable") && e.getEngine().getPower() > 250) {
                    System.out.println(e.getModel());
                }
            });
        }
    }

    static class Car {
        String model;
        Engine engine;
        Cargo cargo;
        Tire tire1;
        Tire tire2;
        Tire tire3;
        Tire tire4;

        public Car(String model, Engine engine, Cargo cargo, Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tire1 = tire1;
            this.tire2 = tire2;
            this.tire3 = tire3;
            this.tire4 = tire4;
        }

        Cargo getCargo() {
            return cargo;
        }

        Tire[] getTires() {
            return new Tire[]{tire1, tire2, tire3, tire4};
        }

        String getModel() {
            return model;
        }

        Engine getEngine() {
            return engine;
        }
    }

    static class Engine {
        int speed;
        int power;

        Engine(int speed, int power) {
            this.speed = speed;
            this.power = power;
        }

        int getPower() {
            return power;
        }
    }

    static class Cargo {
        int weight;
        String type;

        Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    static class Tire {
        double pressure;
        int age;

        Tire(double pressure, int age) {
            this.pressure = pressure;
            this.age = age;
        }

        double getPressure() {
            return pressure;
        }
    }
}
