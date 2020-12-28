package Exams;
//created by J.M.
import java.util.*;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text=new StringBuilder(scan.nextLine());
        String input;
        while (!"Travel".equals(input=scan.nextLine())){
            String[]command=input.split(":");
            switch (command[0]){
                case"Add Stop":
                    int index=Integer.parseInt(command[1]);
                    if(index>=0&&index<text.length()){
                       text.insert(index,command[2]);
                    }
                    System.out.println(text);
                    break;
                case"Remove Stop":
                    int startIndex=Integer.parseInt(command[1]);
                    int endIndex=Integer.parseInt(command[2]);
                    if(startIndex>=0&&endIndex>=0&&startIndex<text.length()&&endIndex<text.length()){
                        text.delete(startIndex,endIndex+1);
                    }
                    System.out.println(text);
                    break;
                case"Switch":
                    text.replace(text.indexOf(command[1]),text.indexOf(command[1])+command[1].length(),command[2]);
                    System.out.println(text);
                    break;
            }
        }
        System.out.printf("Ready for world tour! Planned stops: %s",text);
    }
}
