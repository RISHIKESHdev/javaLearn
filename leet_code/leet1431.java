package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet1431 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,extraCandies;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        extraCandies=in.nextInt();
        System.out.println(kidsWithCandies(nums,extraCandies));
        in.close();
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = max(candies);
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int v : candies)
            result.add(v+extraCandies >= max);
        System.gc();
        return result;
    }
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int v : arr)
            max = Math.max(max, v);
        return max;
    }
}
