package Exams;
//created by J.M.

import java.util.*;

public class Problem5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> usersInfo = new TreeMap<>();
        String input;

        while (!"Statistics".equals(input = scan.nextLine())) {
            String[] command = input.split("->");
            switch (command[0]) {
                case "Add":
                    if (usersInfo.containsKey(command[1])) {
                        System.out.printf("%s is already registered%n", command[1]);
                    } else {
                        usersInfo.put(command[1], new ArrayList<>());
                    }
                    break;
                case "Send":
                    if (usersInfo.containsKey(command[1])) {
                        usersInfo.get(command[1]).add(command[2]);
                    }
                    break;
                case "Delete":
                    if (usersInfo.containsKey(command[1])) {
                        usersInfo.remove(command[1]);
                    } else {
                        System.out.printf("%s not found!%n", command[1]);
                    }
                    break;
            }
        }
        System.out.printf("Users count: %d%n", usersInfo.size());
        usersInfo.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s%n", e.getKey());
                    if (!e.getValue().isEmpty()) {
                        System.out.println("- " + String.join("\n- ", e.getValue()));
                    }
                });
    }
}