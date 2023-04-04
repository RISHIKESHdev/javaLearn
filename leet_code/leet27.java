package leet_code;

import java.util.Scanner;

public class leet27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,val;
        val=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(removeElement(nums,val));
        in.close();
    }
    public static int removeElement(int[] nums, int val) {
        int insIdx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[insIdx++]=nums[i];
            }
        }
        return insIdx;
        // int i=0;
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j] != val){
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         i=i+1;
        //     }
        // }
        // return i;
    }
}
