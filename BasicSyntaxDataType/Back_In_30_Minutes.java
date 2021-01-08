package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class Back_In_30_Minutes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes += 30;

        if (minutes > 59) {
            minutes -= 60;
            hours += 1;
            if (hours > 23) {
                hours -= 24;
            }
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
