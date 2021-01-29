package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class HeartDelivery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] places = Arrays.stream(scan.nextLine().split("@+")).mapToInt(Integer::parseInt).toArray();
        String input;
        int index = 0;

        while (!"Love!".equals(input = scan.nextLine())) {
            String[] jump = input.split("\\s+");
            index += Integer.parseInt(jump[1]);
            if (index > places.length - 1) {
                index = 0;
            }
            if (places[index] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            } else if (places[index] - 2 <= 0) {
                places[index] = 0;
                System.out.printf("Place %d has Valentine's day.%n", index);
            } else {
                places[index] -= 2;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        int successful = (int) IntStream.range(0, places.length).filter(i -> places[i] != 0).count();
        if (successful == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", successful);
        }
    }
}
