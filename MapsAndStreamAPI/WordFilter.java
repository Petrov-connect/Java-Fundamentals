package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class WordFilter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Arrays.stream(scan.nextLine().split("\\s+")).filter(w -> w.length() % 2 == 0).forEach(System.out::println);
    }
}
