package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmojiDetector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split("")).collect(Collectors.toList());
        int coolThreshold = IntStream.range(0, input.size()).filter(i -> Character.isDigit(input.get(i).charAt(0)))
                .map(i -> Integer.parseInt(String.valueOf(input.get(i).charAt(0)))).reduce(1, (a, b) -> a * b);

        List<String> emojiOutput = new ArrayList<>();
        int countEmoji = 0;

        for (int i = 0; i < input.size() - 1; i++) {
            if ((input.get(i).equals("*") || input.get(i).equals(":")) && (input.get(i).equals(input.get(i + 1)))
                    && (input.get(i + 2).charAt(0) < 91 && input.get(i + 2).charAt(0) > 64)) {
                int index = i + 3;
                StringBuilder emojiValid = new StringBuilder(input.get(i) + input.get(i + 1) + input.get(i + 2));
                int countLowerLetters = 1;

                while (((input.get(index).charAt(0) < 123 && input.get(index).charAt(0) > 96))) {
                    countLowerLetters++;
                    emojiValid.append(input.get(index));
                    index++;
                }
                if ((input.get(index).equals(input.get(i))) && (input.get(index).equals(input.get(index + 1)))
                        && (countLowerLetters > 2)) {
                    emojiValid.append(input.get(index)).append(input.get(index + 1));

                    if (IntStream.range(2, emojiValid.length() - 2).map(emojiValid::charAt).sum() > coolThreshold) {
                        emojiOutput.add(emojiValid.toString());
                    }
                    countEmoji++;
                }
                i = index;
            }
        }
        System.out.printf("Cool threshold: %d%n%d emojis found in the text. The cool ones are:%n", coolThreshold, countEmoji);
        emojiOutput.forEach(System.out::println);
    }
}
