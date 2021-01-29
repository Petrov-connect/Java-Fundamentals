package MidExam;
//created by J.M.

import java.util.Scanner;

public class FromLeftToTheRight {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();
            int sumLeft = 0;
            int sumRight = 0;
            StringBuilder numRight = new StringBuilder();
            StringBuilder numLeft = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                String space = " ";
                boolean ifSpace = space.equals(String.valueOf((input).charAt(j)));
                if (ifSpace) {
                    for (int k = j + 1; k < input.length(); k++) {
                        numRight.append((input).charAt(k));
                    }
                    break;
                } else {
                    numLeft.append((input).charAt(j));
                }
            }
            long rightNum = Long.parseLong(numRight.toString());
            long leftNum = Long.parseLong(numLeft.toString());
            if (leftNum > rightNum) {
                String isCorrect = String.valueOf(Math.abs(leftNum));
                for (int s = 0; s < isCorrect.length(); s++) {
                    sumLeft += Integer.parseInt(String.valueOf((isCorrect).charAt(s)));
                }
                System.out.println(sumLeft);
            } else {
                String isCorrect = String.valueOf(Math.abs(rightNum));
                for (int s = 0; s < isCorrect.length(); s++) {
                    sumRight += Integer.parseInt(String.valueOf((isCorrect).charAt(s)));
                }
                System.out.println(sumRight);
            }
        }
    }
}
