package Arrays;
//created by J.M.

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] newArr = new String[arr.length];
            newArr[newArr.length - 1] = arr[0];
            System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
            arr = newArr;
        }
        System.out.println(String.join(" ", arr));
    }
}