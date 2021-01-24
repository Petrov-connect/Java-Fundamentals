package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class Ranking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, String> contestValidation = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> userList = new TreeMap<>();
        String input;

        while (!"end of contests".equals(input = scan.nextLine())) {
            String[] command = input.split(":");
            contestValidation.put(command[0], command[1]);
        }
        while (!"end of submissions".equals(input = scan.nextLine())) {
            String[] command = input.split("=>");
            String contest = command[0];
            String password = command[1];
            String userName = command[2];
            int points = Integer.parseInt(command[3]);

            if (contestValidation.containsKey(contest) && contestValidation.get(contest).equals(password)) {
                userList.putIfAbsent(userName, new LinkedHashMap<>());
                userList.get(userName).putIfAbsent(contest, 0);
                if (userList.get(userName).get(contest) < points) {
                    userList.get(userName).put(contest, points);
                }
            }
        }
        String bestCandidate = "";
        int bestPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : userList.entrySet()) {
            int currentSum = 0;
            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                currentSum += integerEntry.getValue();
            }
            if (currentSum > bestPoints) {
                bestPoints = currentSum;
                bestCandidate = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, bestPoints);
        System.out.println("MapsAndStreamAPI.Ranking: ");
        userList.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(s -> System.out.printf("#  %s -> %d%n", s.getKey(), s.getValue()));
        });
    }
}
