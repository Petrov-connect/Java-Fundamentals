package BasicSyntaxDataType;
//created by J.M.

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= n; i++) {
            BigDecimal num = new BigDecimal(scan.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}

