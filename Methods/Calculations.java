package Methods;
//created by J.M.

import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String command=scan.nextLine();
        int firstNum=Integer.parseInt(scan.nextLine());
        int secondNum=Integer.parseInt(scan.nextLine());

        switch (command){
            case"add": add(firstNum,secondNum);            break;
            case"divide":  divide(firstNum,secondNum);     break;
            case"multiply":  multiply(firstNum,secondNum); break;
            case"subtract":  subtract(firstNum,secondNum); break;
        }
    }
    static void add(int firstNum,int secondNum){
        System.out.println(firstNum+secondNum);
    }
    static void divide(int firstNum,int secondNum){
        System.out.println(firstNum/secondNum);
    }
    static void multiply(int firstNum,int secondNum){
        System.out.println(firstNum*secondNum);
    }
    static void subtract(int firstNum,int secondNum){
        System.out.println(firstNum-secondNum);
    }
}
