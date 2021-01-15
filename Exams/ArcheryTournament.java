package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class ArcheryTournament {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> archeryField = Arrays.stream(scan.nextLine().split("\\|+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input;
        int points = 0;

        while (!"Game over".equals(input = scan.nextLine())) {
            String[] command = input.split("@");
            if (command[0].equals("Reverse")) {
                Collections.reverse(archeryField);
            } else if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < archeryField.size()) {
                int shotIndex;
                if (command[0].equals("Shoot Left")) {
                    shotIndex = Integer.parseInt(command[1]) - (Integer.parseInt(command[2]));
                    while (shotIndex < 0) {
                        shotIndex += archeryField.size();
                    }
                } else {
                    shotIndex = Integer.parseInt(command[1]) + Integer.parseInt(command[2]);
                    while (shotIndex > archeryField.size() - 1) {
                        shotIndex -= archeryField.size();
                    }
                }
                if (archeryField.get(shotIndex) < 5) {
                    points += archeryField.get(shotIndex);
                    archeryField.set(shotIndex, 0);
                } else {
                    points += 5;
                    archeryField.set(shotIndex, archeryField.get(shotIndex) - 5);
                }
            }
        }
        System.out.println(archeryField.toString().replaceAll("[\\[\\]]", "")
                .replaceAll(",", " -"));
        System.out.printf("Iskren finished the archery tournament with %d points!%n", points);
    }
}
