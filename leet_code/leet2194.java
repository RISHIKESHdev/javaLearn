package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet2194 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.next();
        System.out.println(cellsInRange(str));
        in.close();
    }
    public static List<String> cellsInRange(String s) {
        List<String> l = new ArrayList<>();
        for(char i = s.charAt(0); i <= s.charAt(3); i++){
            for(char j = s.charAt(1); j <= s.charAt(4); j++){
                l.add(new String(new char[]{i,j}));
            }
        }
        return l;
        // List<String> answerList = new ArrayList<>();
        // int startLetter, startNumber, endLetter, endNumber;
        // char[] charArray = s.toCharArray();
        // startLetter = charArray[0];
        // startNumber = Character.getNumericValue(charArray[1]);
        // endLetter = charArray[3];
        // endNumber = Character.getNumericValue(charArray[4]);
        // for(int i = startLetter; i <= endLetter; i++) {
        //     String letter = String.valueOf((char) i);
        //     for (int j = startNumber; j <= endNumber; j++) {
        //         answerList.add(letter + j);
        //     }
        // }
        // return answerList;
    }
}
