package ObjectsAndClasses;
//created by J.M.

import java.util.Arrays;

import static java.lang.System.*;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        String[] words = scan.nextLine().split(" ");
        Random randomGenerator = new Random();

        for (int i = 0; i < words.length; i++) {
            int x = randomGenerator.nextInt(words.length);
            int y = randomGenerator.nextInt(words.length);
            String old = words[x];
            words[x] = words[y];
            words[y] = old;
        }
        Arrays.stream(words).forEach(System.out::println);
    }
}
