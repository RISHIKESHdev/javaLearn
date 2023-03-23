package leet_code;

import java.util.Scanner;

public class leet2114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i]=in.next();
        }
        System.out.println(mostWordsFound(strings));
        in.close();
    }
    public static int mostWordsFound(String[] sentences) {
        int ans=0,max=0;
        for(String i:sentences){
            ans=0;
            for(int j=0;j<i.length();j++){
                if(i.charAt(j)==' '){
                    ans+=1;
                }
            }
            if(max<ans+1){
                max=ans+1;
            }
        }
        return max;
    }
}
