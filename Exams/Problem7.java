package Exams;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})]");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String message = matcher.group("message");
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < message.length(); j++) {
                    int digit = message.charAt(j);
                    sb.append(digit).append(" ");
                }
                System.out.println(matcher.group("command") + ": " + sb.toString());

            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}