package Methods;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class AlgorithmSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> array = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> smallerNumbers = new ArrayList<>();
        int smaller = (array.stream().mapToInt(integer -> integer).min().orElse(Integer.MAX_VALUE));
        int indexSmaller = array.indexOf(smaller);
        smallerNumbers.add(smaller);
        int count = 0;

        for (int i = 0; i < array.size(); i++) {
            boolean nextSmaller = true;
            for (Integer integer : array) {
                if (!(array.get(i) <= integer) && checkIsSmaller(integer, smallerNumbers)) {
                    nextSmaller = false;
                    break;
                }
            }
            if (checkIsSmaller(array.get(i), smallerNumbers) && nextSmaller) {
                smallerNumbers.add(array.get(i));
                if (indexSmaller > array.indexOf(array.get(i))) {
                    int old = array.get(i);
                    array.remove(i);
                    array.add(old);
                    count++;
                    indexSmaller = array.indexOf(old);
                } else {
                    indexSmaller = array.indexOf(array.get(i));
                }
                i = -1;
            }
        }
        System.out.println(count);
        System.out.println(array.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    private static boolean checkIsSmaller(Integer integer, List<Integer> smallerNumbers) {
        for (Integer smallerNumber : smallerNumbers) {
            if (!(integer > smallerNumber)) {
                return false;
            }
        }
        return true;
    }
}
