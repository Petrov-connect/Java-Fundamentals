package Exams;
//created by J.M.

import java.util.*;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String input;

        while (!"Done".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Change":
                    text = text.replaceAll(command[1], command[2]);
                    System.out.println(text);
                    break;
                case "Includes":
                    if (text.contains(command[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    if (text.endsWith(command[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    System.out.println(text.indexOf(command[1]));
                    break;
                case "Cut":
                    text = text.substring(Integer.parseInt(command[1]),
                            Integer.parseInt(command[1]) + Integer.parseInt(command[2]));
                    System.out.println(text);
                    break;
            }
        }
    }
}
