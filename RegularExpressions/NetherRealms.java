package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<Integer, Double>> info = new TreeMap<>();
        Pattern healthRegex = Pattern.compile("[^\\d\\-+*/.]");
        Pattern multiRegex = Pattern.compile("[*/]");
        Pattern numberRegex = Pattern.compile("(-?\\d+(\\.\\d+)?)");
        String[] input = scan.nextLine().split("(\\s+)?,\\s*");

        int health = 0;
        double damage = 0.0;

        for (String s : input) {
            Matcher healthCheck = healthRegex.matcher(s);
            while (healthCheck.find()) {
                health += healthCheck.group().charAt(0);
            }
            Matcher numberCheck = numberRegex.matcher(s);
            while (numberCheck.find()) {
                damage += Double.parseDouble(numberCheck.group());
            }
            Matcher multiCheck = multiRegex.matcher(s);
            while (multiCheck.find()) {
                damage = multiCheck.group().equals("*") ? damage * 2 : damage / 2;
            }
            info.put(s, new HashMap<>());
            info.get(s).put(health, damage);
            damage = 0.0;
            health = 0;
        }
        info.forEach((key, value) -> value.forEach((key1, value1) ->
                System.out.printf("%s - %d health, %.2f damage%n", key, key1, value1)));
    }
}
