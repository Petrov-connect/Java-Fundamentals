package Methods;
//created by J.M.

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());
        printGradeWord(grade);
    }

    private static void printGradeWord(double grade) {
        String word = "";
        if (2.00 <= grade && grade < 3.00) {
            word = "Fail";
        } else if (3.00 <= grade && grade < 3.50) {
            word = "Poor";
        } else if (3.50 <= grade && grade < 4.50) {
            word = "Good";
        } else if (4.50 <= grade && grade < 5.50) {
            word = "Very good";
        } else if (5.50 <= grade && grade <= 6.00) {
            word = "Excellent";
        }
        System.out.println(word);
    }
}
