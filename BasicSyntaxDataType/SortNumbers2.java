package BsicSyntaxDataType;
//created by J.M.
import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=Integer.parseInt(scan.nextLine());
        int num2=Integer.parseInt(scan.nextLine());
        int num3=Integer.parseInt(scan.nextLine());
        int[] numbers = {num1,num2,num3};
        Arrays.sort(numbers);
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
    }
}
