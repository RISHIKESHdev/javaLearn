package leet_code;
import java.util.Arrays;
import java.util.Scanner;
public class leet14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        String[] stringArray = new String[n];
        for(int i=0;i<n;i++){
            stringArray[i]=scanner.next();
        }
        scanner.close();
        System.out.println(Arrays.toString(stringArray));
        System.out.println(longestCommonPrefix(stringArray));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<=strs.length-1;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
