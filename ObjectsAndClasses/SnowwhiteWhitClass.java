package ObjectsAndClasses;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class SnowwhiteWhitClass {

    public static class Dwarf {
        private final String hat;
        private final String name;
        private final int physics;

        public Dwarf(String hat, String name, int physics) {
            this.hat = hat;
            this.name = name;
            this.physics = physics;
        }

        public int getPhysics() {
            return physics;
        }

        @Override
        public String toString() {
            return String.format("(%s) %s <-> %d%n", hat, name, physics);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> dwarfs = new LinkedHashMap<>();
        while (!input.equals("Once upon a time")) {
            String[] data = input.split(" <:> ");
            String name = data[0];
            String hat = data[1];
            int physics = Integer.parseInt(data[2]);
            dwarfs.putIfAbsent(hat, new LinkedHashMap<>());
            dwarfs.get(hat).putIfAbsent(name, 0);
            if (physics > dwarfs.get(hat).get(name)) {
                dwarfs.get(hat).put(name, physics);
            }
            input = scanner.nextLine();
        }
        Map<String, Map<String, Integer>> dwarfsSorted = dwarfs.entrySet().stream().sorted((h1, h2) -> Integer.compare(h2.getValue().size(), h1.getValue().size()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        List<Dwarf> objectDwarfs = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> hatColour : dwarfsSorted.entrySet()) {
            for (Map.Entry<String, Integer> nameEntry : hatColour.getValue().entrySet()) {
                Dwarf object = new Dwarf(hatColour.getKey(), nameEntry.getKey(), nameEntry.getValue());
                objectDwarfs.add(object);
            }
        }
        objectDwarfs = objectDwarfs.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getPhysics(), o1.getPhysics()))
                .collect(Collectors.toList());

        objectDwarfs.forEach(System.out::print);
    }
}
