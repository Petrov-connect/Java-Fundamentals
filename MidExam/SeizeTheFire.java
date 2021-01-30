package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class SeizeTheFire {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> cells = Arrays.stream(scan.nextLine().split("#")).collect(Collectors.toList());
        int water = Integer.parseInt(scan.nextLine());

        double effort = 0.0;
        int totalFire = 0;
        List<String> output = new ArrayList<>();
        output.add(0, "Cells:");

        for (String cell : cells) {
            boolean isValid = false;
            String[] input = cell.split(" = ");
            int firePower = Integer.parseInt(input[1]);
            if ((input[0].equals("High")) && (firePower > 80 && firePower < 126)) {
                isValid = true;
            } else if ((input[0].equals("Medium")) && (firePower > 50 && firePower < 81)) {
                isValid = true;
            } else if ((input[0].equals("Low")) && (firePower > 0 && firePower < 51)) {
                isValid = true;
            }
            if (isValid && water >= firePower) {
                water -= firePower;
                effort += firePower * 0.25;
                output.add(" - " + firePower);
                totalFire += firePower;
            }
        }
        output.forEach(System.out::println);
        System.out.printf("Effort: %.2f%nTotal Fire: %d", effort, totalFire);
    }
}
