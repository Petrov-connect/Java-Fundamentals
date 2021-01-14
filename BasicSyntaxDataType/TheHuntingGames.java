package BasicSyntaxDataType;
//created by J.M.

import java.util.*;

public class TheHuntingGames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int countOfPlayers = Integer.parseInt(scan.nextLine());
        double groupEnergy = Double.parseDouble(scan.nextLine());
        double waterPerOne = Double.parseDouble(scan.nextLine());
        double foodPerOne = Double.parseDouble(scan.nextLine());

        double food = foodPerOne * countOfPlayers * days;
        double water = waterPerOne * countOfPlayers * days;

        for (int i = 1; i <= days; i++) {
            double energyLoss = Double.parseDouble(scan.nextLine());
            groupEnergy -= energyLoss;
            if (groupEnergy <= 0) {
                break;
            }
            if (i % 2 == 0) {
                groupEnergy *= 1.05;
                water *= 0.70;
            }
            if (i % 3 == 0) {
                groupEnergy *= 1.10;
                food -= food / countOfPlayers;
            }
        }
        if (groupEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupEnergy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", food, water);
        }
    }
}
