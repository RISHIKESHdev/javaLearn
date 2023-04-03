package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet283 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        moveZeroes(nums);
        in.close();
    }
    public static void moveZeroes(int[] nums) {
        if(nums.length!=1){
            int i=0,j=0,temp=0;
        while(j<nums.length){
            if(nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        }
        System.out.println(Arrays.toString(nums));
    }
}
