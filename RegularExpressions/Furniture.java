package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[>]{2}(?<name>[A-Za-z]+)[<]{2}(?<price>[\\d]+[.]?[\\d]+?)[!](?<quantity>[\\d]+)");
        double sum = 0;
        String input;

        System.out.println("Bought furniture:");

        while (!"Purchase".equals(input = scan.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group("name"));
                sum += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
