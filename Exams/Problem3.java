package Exams;
//created by J.M.

import java.util.*;

public class Problem3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> guestInfo = new TreeMap<>();
        String input;
        int countUnlike = 0;

        while (!"Stop".equals(input = scan.nextLine())) {
            String[] command = input.split("-");
            switch (command[0]) {
                case "Like":
                    guestInfo.putIfAbsent(command[1], new ArrayList<>());
                    if (!guestInfo.get(command[1]).contains(command[2])) {
                        guestInfo.get(command[1]).add(command[2]);
                    }
                    break;
                case "Unlike":
                    if (!guestInfo.containsKey(command[1])) {
                        System.out.printf("%s is not at the party.%n", command[1]);
                    } else {
                        if (!guestInfo.get(command[1]).contains(command[2])) {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", command[1], command[2]);
                        } else {
                            guestInfo.get(command[1]).remove(command[2]);
                            System.out.printf("%s doesn't like the %s.%n", command[1], command[2]);
                            countUnlike++;
                        }
                    }
                    break;
            }
        }
        guestInfo.entrySet().stream().sorted((list1, list2) -> Integer.compare(list2.getValue().size(), list1.getValue().size()))
                .forEach(e -> System.out.println(e.getKey() + ": " + String.join(", ", e.getValue())));
        System.out.printf("Unliked meals: %d", countUnlike);
    }
}
