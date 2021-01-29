package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> nameList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String input;
        int countBlacklisted = 0;
        int countLost = 0;

        while (!"Report".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Blacklist":
                    if (nameList.contains(command[1])) {
                        nameList.set(nameList.indexOf(command[1]), "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", command[1]);
                        countBlacklisted++;
                    } else {
                        System.out.printf("%s was not found.%n", command[1]);
                    }
                    break;
                case "Error":
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < nameList.size()) {
                        if (!nameList.get(Integer.parseInt(command[1])).equals("Blacklisted") && !nameList.get(Integer.parseInt(command[1])).equals("Lost")) {
                            System.out.printf("%s was lost due to an error.%n", nameList.get(Integer.parseInt(command[1])));
                            nameList.set(Integer.parseInt(command[1]), "Lost");
                            countLost++;
                        }
                    }
                    break;
                case "Change":
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < nameList.size()) {
                        System.out.printf("%s changed his username to %s.%n", nameList.get(Integer.parseInt(command[1])), command[2]);
                        nameList.set(Integer.parseInt(command[1]), command[2]);
                    }
                    break;
            }
        }
        System.out.printf("Blacklisted names: %d%nLost names: %d%n%s", countBlacklisted, countLost, (String.join(" ", nameList)));
    }
}
