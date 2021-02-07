package TextProcessing;
//created by J.M.

import java.util.*;

public class TreasureFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] key = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input;

        while (!"find".equals(input = scan.nextLine())) {
            StringBuilder output = new StringBuilder();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (count == key.length) {
                    count = 0;
                }
                output.append((char) (((input.charAt(i))) - key[count]));
                count++;
            }
            System.out.printf("Found %s at %s%n", output.substring(output.indexOf("&") + 1, output.lastIndexOf("&"))
                    , output.substring(output.indexOf("<") + 1, output.lastIndexOf(">")));
        }
    }
}
