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
                    printAllEvenOddNumbers(numbersList, command);
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
        int sumNumbers = 0;
        for (Integer integer : numbersList) {
            sumNumbers += integer;
        }
        System.out.println(sumNumbers);
    }

    private static void printAllEvenOddNumbers(List<Integer> numbersList, String[] command) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (Integer integer : numbersList) {
            if (integer % 2 == 0) {
                even.append(integer).append(" ");
            } else {
                odd.append(integer).append(" ");
            }
        }
        if (command[1].equals("even")) {
            System.out.println(even);
        } else {
            System.out.println(odd);
        }
    }

    private static void checkTheContents(List<Integer> numbersList, String[] command) {
        if (numbersList.contains(Integer.parseInt(command[1]))) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
