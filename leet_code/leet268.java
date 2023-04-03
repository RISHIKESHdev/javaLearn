package leet_code;

import java.util.Scanner;

public class leet268 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(missingNumber(nums));
        in.close();
    }
    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return (nums.length*(nums.length+1)/2)-sum;
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     ans^=i;
        //     ans^=nums[i];
        // }
        // return ans^nums.length;
    }
}
