package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        Pattern countRegex = Pattern.compile("[STARstar]");
        Pattern checkRegex = Pattern.compile("[@](?<planet>[A-Za-z]+)[^@!:>-]*:[\\d]+[^@!:>-]*!([A-Z])![^@!:>-]*->[\\d]+");

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher counter = countRegex.matcher(input);
            int count = 0;

            while (counter.find()) {
                count++;
            }
            StringBuilder output = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                output.append((char) (input.charAt(j) - count));
            }
            Matcher planet = checkRegex.matcher(String.valueOf(output));
            if (planet.find()) {
                if (planet.group(2).equals("A")) {
                    attacked.add(planet.group("planet"));
                } else {
                    destroyed.add(planet.group("planet"));
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attacked.size());
        if (!attacked.isEmpty()) {
            attacked.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
        }
        System.out.printf("Destroyed planets: %d%n", destroyed.size());
        if (!destroyed.isEmpty()) {
            destroyed.stream().sorted().forEach(e -> System.out.printf("-> %s%n", e));
        }
    }
}
