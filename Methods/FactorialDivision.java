package Methods;
//created by J.M.
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f",(double)factorial(num1)/factorial(num2));
    }
    static long factorial(int num){
        long sum=1;
        for (int i = num; i > 1; i--) {
            sum*=i;
        }
        return sum;
    }
}
