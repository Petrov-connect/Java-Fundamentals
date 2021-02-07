package TextProcessing;
//created by J.M.

import java.util.*;

public class Substring {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        StringBuilder output = new StringBuilder(scan.nextLine());
        int index;

        while ((index = output.indexOf(key)) != -1) {
            output.delete(index, index + key.length());
        }
        System.out.println(output);
    }
}
