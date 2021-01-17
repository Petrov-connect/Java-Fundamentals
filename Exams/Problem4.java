package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String input;

        while (!"Finish".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Replace":
                    text = text.replaceAll(command[1], command[2]);
                    System.out.println(text);
                    break;
                case "Cut":
                    if (isValid(Integer.parseInt(command[1]), Integer.parseInt(command[2]), text.length())) {
                        text = new StringBuilder(text).delete(Integer.parseInt(command[1]),
                                Integer.parseInt(command[2]) + 1).toString();
                        System.out.println(text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    if ("Upper".equals(command[1])) {
                        text = text.toUpperCase();
                    } else {
                        text = text.toLowerCase();
                    }
                    System.out.println(text);
                    break;
                case "Check":
                    if (text.contains(command[1])) {
                        System.out.printf("Message contains %s%n", command[1]);
                    } else {
                        System.out.printf("Message doesn't contains %s%n", command[1]);
                    }
                    break;
                case "Sum":
                    if (isValid(Integer.parseInt(command[1]), Integer.parseInt(command[2]), text.length())) {
                        String sub = text.substring(Integer.parseInt(command[1]), Integer.parseInt(command[2]) + 1);
                        int sum = IntStream.range(0, sub.length()).map(sub::charAt).sum();
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
        }
    }

    private static boolean isValid(int startIndex, int endIndex, int length) {
        return (startIndex >= 0 && startIndex < length) && (endIndex >= 0 && endIndex < length);
    }
}
