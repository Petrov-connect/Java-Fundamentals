package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!("end").equals(input = scan.nextLine())) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Contains":
                    checkTheContents(numbersList, command);
                    break;
                case "Print":
                    printAllEvenOrOddNumbers(numbersList, command);
                    break;
                case "Get":
                    printSumOfNumbers(numbersList);
                    break;
                case "Filter":
                    printListWhitCondition(numbersList, command);
                    break;
            }
        }
    }

    private static void printListWhitCondition(List<Integer> numbersList, String[] command) {
        StringBuilder output = new StringBuilder();
        boolean condition = false;
        for (Integer integer : numbersList) {
            switch (command[1]) {
                case "<":
                    condition = integer < Integer.parseInt(command[2]);
                    break;
                case ">":
                    condition = integer > Integer.parseInt(command[2]);
                    break;
                case "<=":
                    condition = integer <= Integer.parseInt(command[2]);
                    break;
                case ">=":
                    condition = integer >= Integer.parseInt(command[2]);
                    break;
            }
            if (condition) {
                output.append(integer).append(" ");
            }
        }
        System.out.println(output);
    }

    static void printSumOfNumbers(List<Integer> numbersList) {
        System.out.println(numbersList.stream().mapToInt(integer -> integer).sum());
    }

    private static void printAllEvenOrOddNumbers(List<Integer> numbersList, String[] command) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                even.append(integer).append(" ");
            } else {
                odd.append(integer).append(" ");
            }
        }
        System.out.println(command[1].equals("even") ? even : odd);
    }

    private static void checkTheContents(List<Integer> numbersList, String[] command) {
        System.out.println(numbersList.contains(Integer.parseInt(command[1])) ? "Yes" : "No such number");
    }
}
