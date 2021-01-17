package Exams;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile("^(.+)>([0-9]{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<\\1$");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println("Password: " + matcher.group(2) + matcher.group(3) + matcher.group(4) + matcher.group(5));
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
