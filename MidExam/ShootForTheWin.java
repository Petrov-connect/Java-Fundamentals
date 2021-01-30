package MidExam;
//created by J.M.

import java.util.*;

public class ShootForTheWin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Boolean[] position = new Boolean[arr.length];
        Arrays.fill(position, true);
        String input;
        int countShot = 0;

        while (!"End".equals(input = scan.nextLine())) {
            int shot = Integer.parseInt(input);
            if (shot >= 0 && shot < arr.length) {
                if (position[shot]) {
                    int value = arr[shot];
                    for (int i = 0; i < arr.length; i++) {
                        if (!(i == shot)) {
                            if (arr[i] > arr[shot] && position[i]) {
                                arr[i] -= value;
                            } else if (position[i]) {
                                arr[i] += value;
                            }
                        }
                    }
                    arr[shot] = -1;
                    countShot++;
                    position[shot] = false;
                }
            }
        }
        System.out.printf("Shot targets: %d -> ", countShot);
        System.out.print(Arrays.toString(arr).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
