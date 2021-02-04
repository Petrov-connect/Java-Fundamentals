package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RageQuit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("([^\\d]+)([\\d]{1,2})");
        Matcher matcher = pattern.matcher(input);
        StringBuilder output = new StringBuilder();

        while (matcher.find()) {
            IntStream.range(0, Integer.parseInt(matcher.group(2)))
                    .mapToObj(i -> matcher.group(1).toUpperCase()).forEach(output::append);
        }
        System.out.printf("Unique symbols used: %d%n%s", output.chars().distinct().count(), output);
    }
}
