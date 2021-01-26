package Methods;
//created by J.M.

import java.util.Scanner;

public class DataType1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!"END".equals(input)) {
            Scanner readData = new Scanner(input);
            checkDataType(readData, input);
            input = scan.nextLine();
        }
    }

    private static void checkDataType(Scanner readData, String input) {
        if (readData.hasNextInt()) {
            System.out.printf("%s is integer type%n", input);
        } else if (readData.hasNextDouble()) {
            System.out.printf("%s is floating point type%n", input);
        } else if (input.length() == 1) {
            System.out.printf("%s is character type%n", input);
        } else if (readData.hasNextBoolean()) {
            System.out.printf("%s is boolean type%n", input);
        } else if (readData.hasNextLine()) {
            System.out.printf("%s is string type%n", input);
        }
    }
}
