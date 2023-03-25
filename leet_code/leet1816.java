package leet_code;

import java.util.Scanner;

public class leet1816 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k;
        String s;
        s=in.next();
        k=in.nextInt();
        System.out.println(truncateSentence(s,k));
        in.close();
    }
    public static String truncateSentence(String s, int k) {
        int spaceCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                spaceCount+=1;
            }
            if(spaceCount==k){
                return s.substring(0,i);
            }
        }
        if(spaceCount+1==k){
                return s;
        }
        else{
            return "";
        }
    }
}
