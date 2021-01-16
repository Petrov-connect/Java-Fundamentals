package Exams;
//created by J.M.

import java.util.*;

public class HeroesOfCodeAndLogic {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, int[]> info = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            info.put(input[0].trim(), new int[]{Integer.parseInt(input[1]), Integer.parseInt(input[2])});
        }
        String input;
        while (!"End".equals(input = scan.nextLine())) {
            String[] command = input.split(" - ");
            switch (command[0]) {
                case "CastSpell":
                    if (info.get(command[1])[1] >= Integer.parseInt(command[2])) {
                        info.get(command[1])[1] -= Integer.parseInt(command[2]);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n"
                                , command[1], command[3], info.get(command[1])[1]);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", command[1], command[3]);
                    }
                    break;
                case "TakeDamage":
                    info.get(command[1])[0] -= Integer.parseInt(command[2]);
                    if (info.get(command[1])[0] > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n"
                                , command[1], Integer.parseInt(command[2]), command[3], info.get(command[1])[0]);
                    } else {
                        info.remove(command[1]);
                        System.out.printf("%s has been killed by %s!%n", command[1], command[3]);
                    }
                    break;
                case "Recharge":
                    int amountMP;
                    if (info.get(command[1])[1] + Integer.parseInt(command[2]) > 200) {
                        amountMP = 200 - info.get(command[1])[1];
                    } else {
                        amountMP = Integer.parseInt(command[2]);
                    }
                    info.get(command[1])[1] += amountMP;
                    System.out.printf("%s recharged for %d MP!%n", command[1], amountMP);
                    break;
                case "Heal":
                    int amountHP;
                    if (info.get(command[1])[0] + Integer.parseInt(command[2]) > 100) {
                        amountHP = 100 - info.get(command[1])[0];
                    } else {
                        amountHP = Integer.parseInt(command[2]);
                    }
                    info.get(command[1])[0] += amountHP;
                    System.out.printf("%s healed for %d HP!%n", command[1], amountHP);
                    break;
            }
        }
        info.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[0], a.getValue()[0]);
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        })
                .forEach(e -> System.out.printf("%s%n  HP: %d%n  MP: %d%n", e.getKey(), e.getValue()[0], e.getValue()[1]));
    }
}
