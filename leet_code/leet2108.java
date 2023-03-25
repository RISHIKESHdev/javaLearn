package leet_code;

import java.util.Scanner;

public class leet2108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]=in.next();
        }
        System.out.println(firstPalindrome(words));
        in.close();
    }
    public static String firstPalindrome(String[] words) {
        for(String i : words){
            if(chkPalin(i)){
                return i;
            }
        }
        return "";
    }
    public static boolean chkPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}
