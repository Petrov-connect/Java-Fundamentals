package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String regex = "\\b(?<day>\\d{2})(/|.|-)(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher date = pattern.matcher(input);

        while (date.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    date.group("day"), date.group("month"), date.group("year"));
        }
    }
}
