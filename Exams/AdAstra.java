package Exams;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        List<String> output = new ArrayList<>();
        Pattern pattern = Pattern.compile("([#|])(?<name>[A-Za-z ]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1");
        Matcher matcher = pattern.matcher(text);
        int calories = 0;

        while (matcher.find()) {
            output.add(String.format("Item: %s, Best before: %s, Nutrition: %s", matcher.group("name"), matcher.group("date"), matcher.group("calories")));
            calories += Integer.parseInt(matcher.group("calories"));
        }
        System.out.printf("You have food to last you for: %d days!%n", calories / 2000);
        output.forEach(System.out::println);
    }
}

