package Arrays;
//created by J.M.

import java.util.Scanner;

public class TrainArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] train = new int[n];
        int sum = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = scan.nextInt();
            sum += train[i];
            System.out.print(train[i] + " ");
        }
        System.out.println("\n" + sum);
    }
}
