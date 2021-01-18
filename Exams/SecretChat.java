package Exams;
//created by J.M.

import java.util.*;

public class SecretChat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scan.nextLine());
        String input;

        while (!"Reveal".equals(input = scan.nextLine())) {
            String[] command = input.split(":\\|:");
            switch (command[0]) {
                case "InsertSpace":
                    System.out.println(text.insert(Integer.parseInt(command[1]), " "));
                    break;
                case "Reverse":
                    if (text.toString().contains(command[1])) {
                        System.out.println(text.delete(text.indexOf(command[1]), text.indexOf(command[1]) + command[1].length())
                                .append(new StringBuilder(command[1]).reverse()));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    System.out.println(text = new StringBuilder(text.toString().replaceAll(command[1], command[2])));
                    break;
            }
        }
        System.out.println("You have a new text message: " + text);
    }
}
