package TextProcessing;
//created by J.M.

import java.util.*;

public class HTML {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        String input;

        System.out.printf("<h1>%n    %s%n</h1>%n<article>%n    %s%n</article>%n", first, second);

        while (!"end of comments".equals(input = scan.nextLine())) {
            System.out.printf("<div>%n    %s%n</div>%n", input);
        }
    }
}
