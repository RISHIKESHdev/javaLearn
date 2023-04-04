package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet645 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(findErrorNums(nums)));
        in.close();
    }
    public static int[] findErrorNums(int[] nums) {
        int dup = -1, missing = 1;
        for(int n:nums){
            if(nums[Math.abs(n)-1]<0){
                dup=Math.abs(n);
            }
            else{
                nums[Math.abs(n)-1]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missing=i+1;
            }
        }
        return new int[]{dup,missing};
        // int xor = 0, xor0 = 0, xor1 = 0;
        // for (int n: nums)
        //     xor ^= n;
        // for (int i = 1; i <= nums.length; i++)
        //     xor ^= i;
        // int rightmostbit = xor & ~(xor - 1);
        // System.out.println(rightmostbit);
        // for (int n: nums) {
        //     if ((n & rightmostbit) != 0)
        //         xor1 ^= n;
        //     else
        //         xor0 ^= n;
        // }
        // for (int i = 1; i <= nums.length; i++) {
        //     if ((i & rightmostbit) != 0)
        //         xor1 ^= i;
        //     else
        //         xor0 ^= i;
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == xor0)
        //         return new int[]{xor0, xor1};
        // }
        // return new int[]{xor1, xor0};
    }
}
