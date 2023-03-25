package leet_code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class leet804 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]=in.next();
        }
        System.out.println(uniqueMorseRepresentations(words));
        in.close();
    }
    public static int uniqueMorseRepresentations(String[] words) {
        int ascii;
        Set<String> seen = new HashSet<>();
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            StringBuilder code = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                ascii=(int)words[i].charAt(j)-97;
                code.append(MORSE[ascii]);
            }
            seen.add(code.toString());
        }
        return seen.size();
    }
}
