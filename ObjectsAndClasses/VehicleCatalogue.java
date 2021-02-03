package ObjectsAndClasses;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class VehicleCatalogue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Vehicle> vehiclesList = new ArrayList<>();
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            String[] data = input.split(" ");
            Vehicle addData = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehiclesList.add(addData);
        }
        while (!"Close the Catalogue".equals(input = scan.nextLine())) {
            String finalInput = input;
            vehiclesList.stream().filter(data -> data.getModel().equals(finalInput)).forEach(data -> System.out.println(data.output()));
        }
        List<Vehicle> cars = vehiclesList.stream().filter(data -> data.getType().equals("car")).collect(Collectors.toList());
        List<Vehicle> truck = vehiclesList.stream().filter(data -> data.getType().equals("truck")).collect(Collectors.toList());
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepower(cars));
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsepower(truck));
    }

    static Double averageHorsepower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        } else {
            return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum() / vehicles.size();
        }
    }

    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public String output() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getType().toUpperCase().charAt(0) + getType().substring(1), getModel(), getColor(), getHorsepower());
        }
    }
}
