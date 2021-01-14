package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class TownInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        String population = scan.nextLine();
        String area = scan.nextLine();

        System.out.printf("Town %s has population of %s and area %s square km.", town, population, area);
    }
}
