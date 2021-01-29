package MidExam;
//created by J.M.

import java.util.Scanner;

public class Login4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        StringBuilder password = new StringBuilder(username);
        password.reverse();
        String inputPassword = scan.nextLine();
        int count = 1;

        while (!inputPassword.equals(password.toString())) {
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.printf("Incorrect password. Try again.%n");
            count++;
            inputPassword = scan.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
