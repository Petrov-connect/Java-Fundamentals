package Methods;
//created by J.M.

import java.util.Scanner;

public class Orders {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String product=scan.nextLine();
        int quantity=Integer.parseInt(scan.nextLine());

        calculateOrder(product,quantity);
    }

    private static void calculateOrder(String product,int quantity) {
        switch (product){
            case"coffee": System.out.printf("%.2f", 1.5 *quantity); break;
            case"water": System.out.printf("%.2f",1.0*quantity);    break;
            case"coke": System.out.printf("%.2f",1.4*quantity);     break;
            case"snacks": System.out.printf("%.2f",2.0*quantity);   break;
        }
    }
}
