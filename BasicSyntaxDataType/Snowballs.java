package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        long snowballValue = 0;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        for (int i = 1; i <= n; i++) {
            int newSnowballSnow = Integer.parseInt(scan.nextLine());
            int newSnowballTime = Integer.parseInt(scan.nextLine());
            int newSnowballQuality = Integer.parseInt(scan.nextLine());
            long sum = (long) Math.pow(((double) newSnowballSnow / newSnowballTime), newSnowballQuality);
            if (sum > snowballValue) {
                snowballValue = sum;
                snowballSnow = newSnowballSnow;
                snowballTime = newSnowballTime;
                snowballQuality = newSnowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
    }
}

