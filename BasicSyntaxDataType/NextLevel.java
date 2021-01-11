package BasicSyntaxDataType;
//created by J.M.

import java.util.*;

public class NextLevel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int experienceNeeded = Integer.parseInt(scan.nextLine());
        int countOfBattle = Integer.parseInt(scan.nextLine());

        double totalExperience = 0;

        for (int i = 1; i <= countOfBattle; i++) {
            double experience = Double.parseDouble(scan.nextLine());
            totalExperience += experience;
            if (i % 3 == 0) {
                totalExperience += experience * 0.15;
            }
            if (i % 5 == 0) {
                totalExperience -= experience * 0.1;
            }
            if (i % 15 == 0) {
                totalExperience += experience * 0.05;
            }
            if (totalExperience >= experienceNeeded) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experienceNeeded - totalExperience);
    }
}
