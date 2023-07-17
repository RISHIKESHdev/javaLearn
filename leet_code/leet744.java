package leet_code;

import java.util.Scanner;

public class leet744 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char target = in.next().charAt(0);
        char[] charArr = new char[n];
        for(int i=0;i<n;i++){
            charArr[i]=in.next().charAt(0);
        }
        System.out.println(nextGreatestLetter(charArr,target));
        in.close();
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if((int)target>=(int)letters[letters.length-1] || (int)target<(int)letters[0]) return letters[0];
        int l=0,r=letters.length-1,m;
        while(l<r){
            m=(r+l)/2;
            if((int)letters[m]>(int)target) r=m;
            else if((int)letters[m]<=(int)target) l=m+1;
        }
        return letters[l];
    }
}
