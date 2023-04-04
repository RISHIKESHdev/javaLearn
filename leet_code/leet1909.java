package leet_code;

import java.util.Scanner;

public class leet1909 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(canBeIncreasing(nums));
        in.close();
    }
    public static boolean canBeIncreasing(int[] nums) {
        boolean f=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                continue;
            }
            if(f){
                return false;
            }
            f=true;
            if(i==0 || nums[i-1]<nums[i+1]){
                nums[i]=nums[i+1];
            }
            else{
                nums[i+1]=nums[i];
            }
        }
        return true;
    }
}
