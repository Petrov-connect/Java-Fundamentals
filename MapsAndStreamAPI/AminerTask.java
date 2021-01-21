package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class AminerTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> output = new LinkedHashMap<>();
        String input;

        while (!"stop".equals(input = scan.nextLine())) {
            int value = Integer.parseInt(scan.nextLine());
            output.put(input, !output.containsKey(input) ? value : output.get(input) + value);
        }
        output.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
