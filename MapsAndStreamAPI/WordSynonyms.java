package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class WordSynonyms {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<String>> wordSynonym = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            wordSynonym.putIfAbsent(word, new ArrayList<>());
            wordSynonym.get(word).add(synonym);
        }
        wordSynonym.forEach((key, value) -> System.out.println(key + " - " + String.join(", ", value)));
    }
}
