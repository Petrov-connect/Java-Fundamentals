package MidExam;
//created by J.M.

import java.util.*;

public class NationalCourt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int employees1 = Integer.parseInt(scan.nextLine());
        int employees2 = Integer.parseInt(scan.nextLine());
        int employees3 = Integer.parseInt(scan.nextLine());
        int peopleCount = Integer.parseInt(scan.nextLine());

        int peoplePerHour = employees1 + employees2 + employees3;
        int countHours = 0;

        while (!(peopleCount <= 0)) {
            countHours++;
            if (!(countHours % 4 == 0)) {
                peopleCount -= peoplePerHour;
            }

        }
        System.out.printf("Time needed: %dh.", countHours);
    }
}
