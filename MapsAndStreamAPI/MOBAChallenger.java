package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class MOBAChallenger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> playerInfo = new TreeMap<>();
        String input;

        while (!"Season end".equals(input = scan.nextLine())) {
            if (input.contains(" -> ")) {
                String[] command = input.split(" -> ");
                String player = command[0];
                String position = command[1];
                int points = Integer.parseInt(command[2]);
                playerInfo.putIfAbsent(player, new LinkedHashMap<>());
                playerInfo.get(player).putIfAbsent(position, 0);
                if (playerInfo.get(player).get(position) < points) {
                    playerInfo.get(player).put(position, points);
                }
            } else {
                String[] fight = input.split("\\s+vs\\s+");
                String playerOne = fight[0];
                String playerTwo = fight[1];
                if (!playerOne.equals(playerTwo) && playerInfo.containsKey(playerOne) && playerInfo.containsKey(playerTwo)) {
                    int totalPointsPlayerOne = 0;
                    int totalPointsPlayerTwo = 0;
                    for (Map.Entry<String, Integer> playerOneEntry : playerInfo.get(playerOne).entrySet()) {
                        for (Map.Entry<String, Integer> playerTwoEntry : playerInfo.get(playerTwo).entrySet()) {
                            if (playerOneEntry.getKey().equals(playerTwoEntry.getKey())) {
                                totalPointsPlayerOne += playerOneEntry.getValue();
                                totalPointsPlayerTwo += playerTwoEntry.getValue();
                            }
                        }
                    }
                    if (totalPointsPlayerOne > totalPointsPlayerTwo) {
                        playerInfo.remove(playerTwo);
                    } else if (totalPointsPlayerTwo > totalPointsPlayerOne) {
                        playerInfo.remove(playerOne);
                    }
                }
            }
        }
        playerInfo.entrySet().stream().sorted((player1, player2) ->
                Integer.compare(player2.getValue().values().stream().mapToInt(Integer::intValue).sum(),
                        player1.getValue().values().stream().mapToInt(Integer::intValue).sum())).forEach(entry -> {
            System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream()
                    .mapToInt(Integer::intValue).sum());
            entry.getValue().entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                    .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(value -> System.out.printf("- %s <::> %d%n", value.getKey(), value.getValue()));
        });
    }
}
