package MidExam;
//created by J.M.

import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double balance=Double.parseDouble(scan.nextLine());
        String game = scan.nextLine();
        double spend=0;

        while (!game.equals("Game Time")) {
            double price=0; boolean found=true;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition": price = 39.99; break;
                case "CS: OG": price = 15.99; break;
                case "Zplinter Zell": price = 19.99; break;
                case "Honored 2": price = 59.99; break;
                case "RoverWatch": price = 29.99; break;
                default:
                    System.out.println("Not Found"); found=false; break;
            }
            if(found) {
                if (balance < price) {
                    System.out.println("Too Expensive");
                    price = 0;
                } else {
                    System.out.printf("Bought %s%n", game);
                }
                balance-=price;
                spend+=price;
            if(balance==0){
                System.out.println("Out of money!"); return;
                }
            }
            game = scan.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spend,balance);
    }
}
