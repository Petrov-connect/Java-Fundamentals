package TextProcessing;
//created by J.M.

import java.util.*;

public class MorseCodeTranslator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String,String>morse=new HashMap<>(){{put( ".-","A");put( "-...","B");put( "-.-.","C");put( "-..","D");put( ".","E");
            put( "..-.","F");put( "--.","G");put( "....","H");put("..","I");put( ".---","J");put( "-.-","K");put( ".-..","L");
            put( "--","M");put( "-.","N");put( "---","O");put( ".--.","P");put( "--.-","Q");put( ".-.","R");put( "...","S");
            put( "-","T");put( "..-","U");put( "...-","V");put( ".--","W");put( "-..-","X");put( "-.--","Y");put( "--..","Z");}};

        String[]input=scan.nextLine().split("\\s+\\|\\s+");

        for (String s : input) {
            StringBuilder output=new StringBuilder();
            String[]splitInput=s.split("\\s+");
            for (String s1 : splitInput) {
                String toAppend=morse.get(s1);
                output.append(toAppend);
            }
            System.out.printf("%s ",output);
        }
    }
}
