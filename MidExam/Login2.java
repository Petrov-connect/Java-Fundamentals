package MidExam;
//created by J.M.

import java.util.Scanner;

public class Login2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        StringBuilder password = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            password.append(username.charAt(i));
        }
        String inputPassword = scan.nextLine();
        int count = 1;
        while (!inputPassword.equals(password.toString())) {
            if (count == 4) {
                System.out.printf("User %s blocked!%n", username);
                return;
            }
            System.out.printf("Incorrect password. Try again.%n");
            count++;
            inputPassword = scan.nextLine();
        }
        System.out.printf("User %s logged in.%n", username);
    }
}
