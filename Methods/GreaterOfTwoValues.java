package Methods;
//created by J.M.

import java.util.Scanner;

public class GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String first = scan.nextLine();
        String second = scan.nextLine();

        switch (type) {
            case "int":
                System.out.println(getMax(Integer.parseInt(first), Integer.parseInt(second)));
                break;
            case "char":
                System.out.println(getMax(first.charAt(0), second.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;

        }
    }

    static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    static char getMax(char first, char second) {
        return (char) Math.max(first, second);
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
