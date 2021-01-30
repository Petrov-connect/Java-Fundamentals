package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class Articles {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        Article data = new Article(input[0], input[1], input[2]);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            input = scan.nextLine().split(": ");
            switch (input[0]) {
                case "Edit":
                    data.editContent(input[1]);
                    break;
                case "ChangeAuthor":
                    data.changeAuthor(input[1]);
                    break;
                case "Rename":
                    data.rename(input[1]);
                    break;
            }
        }
        System.out.println(data.output());
    }

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void rename(String title) {
            this.title = title;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String output() {
            return String.format("%s - %s: %s%n", getTitle(), getContent(), getAuthor());
        }
    }
}
