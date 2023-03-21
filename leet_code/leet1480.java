package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
        in.close();
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length ; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
