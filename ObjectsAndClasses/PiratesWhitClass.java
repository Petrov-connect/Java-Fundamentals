package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class PiratesWhitClass {

    static class Cities {

        String city;
        int population;
        int gold;

        public Cities(String city, int population, int gold) {
            this.city = city;
            this.population = population;
            this.gold = gold;
        }

        public String getCity() {
            return city;
        }

        public int getGold() {
            return gold;
        }

        public void increaseGold(int gold) {
            this.gold += gold;
        }

        public void increasePopulation(int population) {
            this.population += population;
        }

        public void decreaseGold(int gold) {
            this.gold -= gold;
        }

        public void decreasePopulation(int population) {
            this.population -= population;
        }

        @Override
        public String toString() {
            return city + " -> Population: " + population + " citizens, Gold: " + gold + " kg";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cities> citiesInfo = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!"Sail".equals(line)) {

            String[] input = line.split("\\|+");

            String cityName = input[0];
            int population = Integer.parseInt(input[1]);
            int gold = Integer.parseInt(input[2]);

            if (citiesInfo.get(cityName) == null) {
                citiesInfo.put(cityName, new Cities(cityName, population, gold));
            } else {
                Cities current = citiesInfo.get(cityName);
                current.increasePopulation(population);
                current.increaseGold(gold);
                citiesInfo.put(cityName, current);
            }
            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!"End".equals(line)) {
            String[] inputs = line.split("=>");
            String command = inputs[0];
            String cityName = inputs[1];
            Cities city = citiesInfo.get(cityName);
            int gold;
            switch (command) {
                case "Plunder":
                    int population = Integer.parseInt(inputs[2]);
                    gold = Integer.parseInt(inputs[3]);
                    city.decreasePopulation(population);
                    city.decreaseGold(gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, gold, population);
                    if (city.getGold() == 0 || city.population == 0) {
                        System.out.printf("%s has been wiped off the map!%n", cityName);
                        citiesInfo.remove(cityName);
                    }
                    break;
                case "Prosper":
                    gold = Integer.parseInt(inputs[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        city.increaseGold(gold);
                        citiesInfo.put(cityName, city);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, cityName, city.getGold());
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        if (citiesInfo.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", citiesInfo.size());
            citiesInfo.values().stream()
                    .sorted(Comparator.comparing(Cities::getGold).reversed().thenComparing(Cities::getCity))
                    .forEach(System.out::println);
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}