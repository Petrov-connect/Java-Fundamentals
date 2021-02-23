package Methods;
//created by J.M.
import java.util.*;

public class ArrayManipulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array= Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input;
        while (!"end".equals(input=scan.nextLine())){
            String [] command = input.split(" ");
                switch (command[0]){
                    case"exchange":
                        int exchangeIndex=Integer.parseInt(command[1]);
                        if(exchangeIndex<0||exchangeIndex>array.length-1){
                          System.out.println("Invalid index");
                        }else {
                          exchangeArray(array, exchangeIndex);
                        } break;
                    case"max":
                        int maxIndex=getMaxEvenOddIndex(array,command);
                        if(maxIndex==-1){
                            System.out.println("No matches");
                        }else{
                            System.out.println(maxIndex);
                        } break;
                    case"min":
                        int minIndex=getMinEvenOddIndex(array,command);
                        if(minIndex==-1){
                            System.out.println("No matches");
                        }else{
                            System.out.println(minIndex);
                        } break;
                    case"first":
                        if(Integer.parseInt(command[1])>array.length){
                            System.out.println("Invalid count");
                        }else {
                            String outputFirst = getFirstOddEvenNumbers(array, command);
                            System.out.println(Arrays.toString(Arrays.stream(outputFirst.split(" ")).toArray()));
                        } break;
                    case"last":
                        if(Integer.parseInt(command[1])>array.length){
                            System.out.println("Invalid count");
                        }else {
                            String outputLast = getLastOddEvenNumbers(array, command);
                            System.out.println(Arrays.toString(Arrays.stream(outputLast.split(" ")).toArray()));
                        } break;
                }
        }
        System.out.println(Arrays.toString(array));
    }
    private static String getLastOddEvenNumbers(int[] arr, String[] command) {
        StringBuilder arrOutput= new StringBuilder();
        int countOdd=Integer.parseInt(command[1]) , countEven=Integer.parseInt(command[1]);
        if (command[2].equals("odd")) {
            for (int i=arr.length-1; i>=0; i--) {
                if ((arr[i] % 2 != 0)&&(countOdd>0)) {
                    arrOutput.append(arr[i]).append(" "); countOdd--;
                }
            }
        } else {
            for (int i=arr.length-1; i>=0; i--) {
                if ((arr[i] % 2 == 0)&&(countEven>0)) {
                    arrOutput.append(arr[i]).append(" "); countEven--;
                }
            }
        }
        Object[] out=Arrays.stream(String.valueOf(arrOutput).split(" ")).toArray();
        arrOutput = new StringBuilder();
        for (int i = out.length - 1; i >= 0; i--) {
            arrOutput.append(out[i]).append(" ");
        }
        return String.valueOf(arrOutput);
    }
    private static String getFirstOddEvenNumbers(int[] arr,String[] command) {
        StringBuilder arrOutput = new StringBuilder();
        int countOdd = Integer.parseInt(command[1]) , countEven=Integer.parseInt(command[1]);
        if (command[2].equals("odd")) {
            for (int value : arr) {
                if ((value % 2 != 0)&&(countOdd>0)) {
                    arrOutput.append(value).append(" "); countOdd--;
                }
            }
        } else {
            for (int value : arr) {
                if ((value % 2 == 0)&&(countEven>0)) {
                    arrOutput.append(value).append(" "); countEven--;
                }
            }
        }
        return String.valueOf(arrOutput);
    }
    private static int getMinEvenOddIndex(int[] arr,String []command) {
        int minOddIndex=-1 , minEvenIndex=-1 , minOdd=Integer.MAX_VALUE , minEven=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2 !=0) && (arr[i] <= minOdd)){
                minOdd = arr[i]; minOddIndex = i;
            }else if((arr[i] % 2 == 0) && (arr[i] <= minEven)){
                minEven = arr[i]; minEvenIndex = i;
            }
        }
        return command[1].equals("odd") ? minOddIndex : minEvenIndex;
    }
    private static int getMaxEvenOddIndex(int[] arr,String []command) {
        int maxOddIndex = -1 ,  maxEvenIndex = -1 , maxEven = Integer.MIN_VALUE ,  maxOdd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0)&&(arr[i] >= maxEven)) {
                maxEven = arr[i]; maxEvenIndex = i;
            } else if((arr[i] % 2 != 0)&&(arr[i] >= maxOdd)){
                maxOdd = arr[i]; maxOddIndex = i;
            }
        }
        return command[1].equals("odd") ? maxOddIndex : maxEvenIndex;
    }
    private static void exchangeArray(int[] arr, int exchangeIndex) {
            int [] arrDuplicate=new int [arr.length]; int a=arr.length-1;
            for (int i = exchangeIndex; i >= 0; i--) {
                arrDuplicate[a] = arr[i]; a--;
            }
            a=0;
            for (int i = exchangeIndex+1; i < arr.length; i++) {
                arrDuplicate[a]=arr[i]; a++;
            }
            System.arraycopy(arrDuplicate, 0, arr, 0, arr.length);
    }
}

