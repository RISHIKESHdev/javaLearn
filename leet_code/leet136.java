package leet_code;

import java.util.Scanner;

public class leet136 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(singleNumber(nums));
        in.close();
    }
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
           ans=ans^nums[i];
        }
        return ans;
    }
}
