package Methods;
//created by J.M.

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        boolean check1 = checkLengthPassword(password);
        boolean check2 = checkForLettersAndDigits(password);
        boolean check3 = checkForTwoDigit(password);

        if (check1 && check2 && check3) {
            System.out.println("Password is valid");
        }
    }

    static boolean checkLengthPassword(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    static boolean checkForLettersAndDigits(String password) {
        boolean trueFalse = true;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                System.out.println("Password must consist only of letters and digits");
                trueFalse = false;
                break;
            }
        }
        return trueFalse;
    }

    static boolean checkForTwoDigit(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}
