package Exams;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String regEx = "U\\$(?<name>[A-Z][a-z]{2,})U\\$P@\\$(?<pass>[A-Za-z]{5,}\\d+)P@\\$";
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(regEx);
        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println("Registration was successful");
                System.out.println("Username: " + matcher.group("name") + ", Password: " + matcher.group("pass"));
                count++;
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + count);
    }
}