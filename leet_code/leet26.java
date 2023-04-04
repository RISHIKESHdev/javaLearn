package leet_code;

import java.util.Scanner;

public class leet26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(removeDuplicates(nums));
        in.close();
    }
    public static int removeDuplicates(int[] nums) {
        int insertIndx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[insertIndx++]=nums[i];
                // insertIndx++;
            }
        }
        return insertIndx;
    }
}
