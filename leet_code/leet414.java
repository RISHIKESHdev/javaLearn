package leet_code;

import java.util.Scanner;

public class leet414 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(thirdMax(nums));
        in.close();
    }
    public static int thirdMax(int[] nums) {
        long firstmax=Long.MIN_VALUE;
        long secondmax=Long.MIN_VALUE;
        long thirdmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
                thirdmax=secondmax;
                secondmax=firstmax;
                firstmax=nums[i];
            }
            else if(nums[i]>secondmax && nums[i]<firstmax){
               thirdmax=secondmax;
               secondmax=nums[i];
            }
            else if(nums[i]>thirdmax && nums[i]<secondmax){
                thirdmax=nums[i];
            }
        }
        return (int)(thirdmax==Long.MIN_VALUE?firstmax:thirdmax);
    }
}
