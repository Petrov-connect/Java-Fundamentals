package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        List<Integer> drumSet = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> saveDrumSet = new ArrayList<>(drumSet);
        String input;

        while (!"Hit it again, Gabsy!".equals(input = scan.nextLine())) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - hitPower);
                if (drumSet.get(i) <= 0) {
                    if (!((money - (saveDrumSet.get(i) * 3.0)) < 0)) {
                        drumSet.set(i, saveDrumSet.get(i));
                        money -= saveDrumSet.get(i) * 3;
                    } else {
                        drumSet.remove(i);
                        saveDrumSet.remove(i);
                        i--;
                    }
                }
            }
        }
        System.out.println(drumSet.toString().replaceAll("[\\[\\],]", "").replaceAll(", ", " "));
        System.out.printf("Gabsy has %.2flv.", money);
    }
}
