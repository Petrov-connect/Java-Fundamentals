package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class PokemonDoNotGo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> pokemonList = Arrays.stream((scan.nextLine().split("\\s+")))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedElements = 0;

        while (!pokemonList.isEmpty()) {
            int index = Integer.parseInt(scan.nextLine());
            int valueElement;
            if (index < 0) {
                valueElement = pokemonList.get(0);
                sumRemovedElements += valueElement;
                if (pokemonList.size() > 1) {
                    pokemonList.set(0, pokemonList.get(pokemonList.size() - 1));
                } else {
                    pokemonList.remove(0);
                }
            } else if (index > pokemonList.size() - 1) {
                valueElement = pokemonList.get(pokemonList.size() - 1);
                sumRemovedElements += valueElement;
                if (pokemonList.size() > 1) {
                    pokemonList.set(pokemonList.size() - 1, pokemonList.get(0));
                } else {
                    pokemonList.remove(0);
                }
            } else {
                valueElement = pokemonList.get(index);
                sumRemovedElements += valueElement;
                pokemonList.remove(index);
            }
            for (int i = 0; i < pokemonList.size(); i++) {
                if (pokemonList.get(i) > valueElement) {
                    pokemonList.set(i, pokemonList.get(i) - valueElement);
                } else {
                    pokemonList.set(i, pokemonList.get(i) + valueElement);
                }
            }
        }
        System.out.println(sumRemovedElements);
    }
}
