package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Crafting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] weaponName = scanner.nextLine().split("\\|");
        String input;

        while (!"Done".equals(input = scanner.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Move":
                    int index = Integer.parseInt(command[2]);
                    if (command[1].equals("Left")) {
                        if (0 < index && index < weaponName.length) {
                            Collections.swap(Arrays.asList(weaponName), index, index - 1);
                        }
                    } else {
                        if (0 <= index && index < weaponName.length - 1) {
                            Collections.swap(Arrays.asList(weaponName), index, index + 1);
                        }
                    }
                    break;
                case "Check":
                    if (command[1].equals("Even")) {
                        IntStream.range(0, weaponName.length).filter(i -> i % 2 == 0)
                                .mapToObj(i -> weaponName[i] + " ").forEach(System.out::print);
                    } else {
                        IntStream.range(0, weaponName.length).filter(i -> i % 2 != 0)
                                .mapToObj(i -> weaponName[i] + " ").forEach(System.out::print);
                    }
                    System.out.println();
                    break;
            }
        }
        System.out.printf("You crafted %s!", String.join("", weaponName));
    }
}
