package Methods;
//created by J.M.

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialDivision {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", (double) factorial(num1) / factorial(num2));
    }

    static long factorial(int num) {
        return IntStream.iterate(num, i -> i > 1, i -> i - 1).asLongStream().reduce(1, (a, b) -> a * b);
    }
}
