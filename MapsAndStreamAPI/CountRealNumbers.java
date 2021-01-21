package MapsAndStreamAPI;
//created by J.M.

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] num = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> output = new TreeMap<>();

        Arrays.stream(num).forEach(v -> {
            if (!output.containsKey(v)) {
                output.put(v, 0);
            }
            output.put(v, output.get(v) + 1);
        });
        output.forEach((key, value) -> {
            DecimalFormat df = new DecimalFormat("#.########");
            System.out.printf("%s -> %d%n", df.format(key), value);
        });
    }
}
