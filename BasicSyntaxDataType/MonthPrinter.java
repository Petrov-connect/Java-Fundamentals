package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class MonthPrinter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mont=Integer.parseInt(scan.nextLine());

        String montName;

        switch (mont){
            case 1: montName="January"; break;
            case 2: montName="February"; break;
            case 3: montName="March"; break;
            case 4: montName="April"; break;
            case 5: montName="May"; break;
            case 6: montName="June"; break;
            case 7: montName="July"; break;
            case 8: montName="August"; break;
            case 9: montName="September"; break;
            case 10: montName="October"; break;
            case 11: montName="November"; break;
            case 12: montName="December"; break;
            default: montName="Error!"; break;
        }
        System.out.println(montName);
    }
}
