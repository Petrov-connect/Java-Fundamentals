package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class PokeMon {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int Y = Integer.parseInt(scan.nextLine());

        int count = 0;
        int x = N / 2;
        boolean realHalf = N % x == 0;

        while (N >= M) {
            N -= M;
            count++;
            if (Y > 0 && realHalf && N == x) {
                N /= Y;
            }
        }
        System.out.println(N);
        System.out.println(count);
    }
}
