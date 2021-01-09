package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        int courses = (int) Math.ceil((double) people / capacity);

        System.out.println(courses);
    }
}
