package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        String[] name = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println(name[num % 10]);
    }
}
