package Exams;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: %d" + destinations.stream().mapToInt(String::length).sum());
    }
}
