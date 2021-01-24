package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class SoftUniExamResults {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> statisticsPoints = new TreeMap<>();
        Map<String, Integer> statisticsLanguage = new TreeMap<>();
        String input;

        while (!"exam finished".equals(input = scan.nextLine())) {
            String[] command = input.split("-");
            if (command[1].equals("banned")) {
                statisticsPoints.remove(command[0]);
            } else {
                statisticsLanguage.put(command[1], !statisticsLanguage.containsKey(command[1]) ? 1 :
                        statisticsLanguage.get(command[1]) + 1);
                statisticsPoints.putIfAbsent(command[0], 0);
                if (statisticsPoints.get(command[0]) < Integer.parseInt(command[2])) {
                    statisticsPoints.put(command[0], Integer.parseInt(command[2]));
                }
            }
        }
        System.out.println("Results:");
        statisticsPoints.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));
        System.out.println("Submissions:");
        statisticsLanguage.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
    }
}
