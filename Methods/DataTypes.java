package Methods;
//created by J.M.

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String input = scan.nextLine();

        multipleData(input, type);

    }

    private static void multipleData(String input, String type) {
        switch (type) {
            case "int":
                System.out.println(Integer.parseInt(input) * 2);
                break;
            case "real":
                System.out.printf("%.2f", Double.parseDouble(input) * 1.5);
                break;
            case "string":
                System.out.printf("$%s$", input);
        }
    }
}
