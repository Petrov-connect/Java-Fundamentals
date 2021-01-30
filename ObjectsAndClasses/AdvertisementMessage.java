package ObjectsAndClasses;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class AdvertisementMessage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        IntStream.range(0, n).mapToObj(i -> new Message()).map(Message::output).forEach(System.out::println);
    }

    public static class Message {
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        public String output() {
            return String.format("%s %s %s – %s", phrases[random.nextInt(phrases.length)], events[random.nextInt(events.length)], authors[random.nextInt(authors.length)], cities[random.nextInt(cities.length)]);
        }
    }
}
