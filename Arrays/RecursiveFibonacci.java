package Arrays;
//created by J.M.

import java.util.Scanner;

public class RecursiveFibonacci {

    public static long[] fibonacciInfo;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        fibonacciInfo= new long[n];
        fibonacciInfo[0] = 1;
        fibonacciInfo[1] = 1;
        System.out.println(Fibonacci(n));

    }

    static long Fibonacci(long n) {
        long currentFibonacci;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibonacciInfo[(int) n] != 0) {
            return fibonacciInfo[(int) n];
        } else {
            currentFibonacci = Fibonacci(n - 1) + Fibonacci(n - 2);
            fibonacciInfo[(int) n] = currentFibonacci;
            return currentFibonacci;
        }
    }
}
