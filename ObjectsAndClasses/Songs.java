package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class Songs {

    static class Song {
        private String typeList;

        private String getTypeList() {
            return typeList;
        }

        private void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        String time;

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("_");
            Song currentSong = new Song();
            currentSong.setTypeList(input[0]);
            currentSong.setName(input[1]);
            currentSong.setTime(input[2]);
            songs.add(currentSong);
        }
        String input = scan.nextLine();
        if (input.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}

