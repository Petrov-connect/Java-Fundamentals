package Exams;
//created by J.M.

import java.util.*;

public class PasswordReset {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder password = new StringBuilder(scan.nextLine());
        String input;

        while (!"Done".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < password.length(); i += 2) {
                        newPassword.append(password.charAt(i));
                    }
                    password = new StringBuilder(newPassword);
                    System.out.println(password);
                    break;
                case "Cut":
                    password.delete(Integer.parseInt(command[1]), Integer.parseInt(command[1]) + Integer.parseInt(command[2]));
                    System.out.println(password);
                    break;
                case "Substitute":
                    if (password.toString().contains(command[1])) {
                        password = new StringBuilder(password.toString().replace(command[1], command[2]));
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
        }
        System.out.println("Your password is: " + password);
    }
}
