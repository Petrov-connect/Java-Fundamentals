package Arrays;
//created by J.M.

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (1 <= num && num <= 7) {
            System.out.println(days[num - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
