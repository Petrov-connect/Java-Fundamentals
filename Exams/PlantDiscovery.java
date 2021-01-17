package Exams;
//created by J.M.

import java.util.*;

public class PlantDiscovery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Map<String, List<Double>>> plantInfo = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("<->");
            plantInfo.put(input[0], new HashMap<>() {{
                put(input[1], new ArrayList<>());
            }});
        }
        String input;

        while (!"Exhibition".equals(input = scan.nextLine())) {
            String[] command = input.split(": ");
            String[] commands = command[1].split(" - ");
            switch (command[0]) {
                case "Rate":
                    if (plantInfo.containsKey(commands[0])) {
                        plantInfo.get(commands[0]).get(plantInfo.get(commands[0]).keySet().toString()
                                .replaceAll("[\\[\\]]", "")).add(Double.parseDouble(commands[1]));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    if (plantInfo.containsKey(commands[0])) {
                        plantInfo.put(commands[0], new HashMap<>() {{
                            put(commands[1], plantInfo.get(commands[0]).get(plantInfo.get(commands[0]).keySet().toString()
                                    .replaceAll("[\\[\\]]", "")));
                        }});
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if (plantInfo.containsKey(commands[0])) {
                        plantInfo.get(commands[0]).get(plantInfo.get(commands[0]).keySet().toString()
                                .replaceAll("[\\[\\]]", "")).clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        System.out.println("Plants for the exhibition:");
        plantInfo.entrySet().stream().sorted((a, b) -> {
            int sort = Integer.compare(Integer.parseInt(b.getValue().keySet().toString()
                            .replaceAll("[\\[\\]]", "")),
                    Integer.parseInt((a.getValue().keySet().toString().replaceAll("[\\[\\]]", ""))));
            if (sort == 0) {
                sort = Double.compare(b.getValue().get(b.getValue().keySet().toString()
                        .replaceAll("[\\[\\]]", ""))
                        .stream().mapToDouble(Double::doubleValue).average().orElse(0.00),
                        a.getValue().get(a.getValue().keySet().toString()
                                .replaceAll("[\\[\\]]", "")).stream()
                                .mapToDouble(Double::doubleValue).average().orElse(0.00));
            }
            return sort;
        }).forEach(e -> System.out.printf("- %s; Rarity: %s; Rating: %.2f%n",
                e.getKey(), e.getValue().keySet().toString().replaceAll("[\\[\\]]", ""),
                e.getValue().get(e.getValue().keySet().toString().replaceAll("[\\[\\]]", ""))
                        .stream().mapToDouble(Double::doubleValue).average().orElse(0.00)));
    }
}