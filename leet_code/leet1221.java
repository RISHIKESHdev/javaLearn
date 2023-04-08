package leet_code;

import java.util.Scanner;

public class leet1221 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.next();
        System.out.println(balancedStringSplit(str));
        in.close();
    }
    public static int balancedStringSplit(String s) {
        int ans=0,cou=0;
        char aux=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(aux==s.charAt(i)){
                cou+=1;
            }else{
                cou-=1;
            }
            if(cou==0){
                ans+=1;
            }
        }
        return ans;
    }
}
