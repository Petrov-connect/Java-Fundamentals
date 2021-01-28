package MidExam;
//created by J.M.

import java.util.*;

public class BonusScoringSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());

        double max = 0;
        double maxBonus = 0;

        for (int i = 0; i < students; i++) {
            double attendances = Double.parseDouble(scan.nextLine());
            if (attendances > max) {
                max = attendances;
                maxBonus = ((attendances / lectures) * (5 + additionalBonus));
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.", max);
    }
}
