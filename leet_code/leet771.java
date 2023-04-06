package leet_code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class leet771 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str,str1;
        str=in.next();
        str1=in.next();
        System.out.println(numJewelsInStones(str,str1));
        in.close();
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
     for(int i: jewels.toCharArray())
         set.add(i);
     for(int j: stones.toCharArray())
         if(set.contains(j)) count++;
        return count;
    }
}
