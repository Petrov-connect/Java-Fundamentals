package Exams;
//created by J.M.

import java.util.*;

public class ActivationKeys {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder rawKey = new StringBuilder(scan.nextLine());
        String input;

        while (!"Generate".equals(input = scan.nextLine())) {
            String[] command = input.split(">>>");
            if (command[0].equals("Contains")) {
                if (rawKey.toString().contains(command[1])) {
                    System.out.printf("%s contains %s%n", rawKey, command[1]);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (command[0].equals("Slice")) {
                rawKey.delete(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                System.out.println(rawKey);
            } else {
                if (command[1].equals("Upper")) {
                    rawKey.replace(Integer.parseInt(command[2]), Integer.parseInt(command[3]),
                            rawKey.substring(Integer.parseInt(command[2]), Integer.parseInt(command[3])).toUpperCase());

                } else {
                    rawKey.replace(Integer.parseInt(command[2]), Integer.parseInt(command[3]),
                            rawKey.substring(Integer.parseInt(command[2]), Integer.parseInt(command[3])).toLowerCase());
                }
                System.out.println(rawKey);
            }
        }
        System.out.println("Your activation key is: " + rawKey);
    }
}