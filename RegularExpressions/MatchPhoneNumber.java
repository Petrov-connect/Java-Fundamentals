package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String regex = "\\+359([ -])2(\\1)[0-9]{3}(\\1)[0-9]{4}\\b";
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> output = new ArrayList<>();

        while (matcher.find()) {
            output.add(matcher.group());
        }
        System.out.println(String.join(", ", output));
    }
}
