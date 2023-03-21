package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1470 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums,n/2)));
        in.close();
    }
    public static int[] shuffle(int[] nums, int n) {
        int secNum,firNum;
        for(int i=n;i<2*n;i++){
            secNum=nums[i]<<10;
            nums[i-n]=nums[i-n] | secNum;
        }
        int allOnes = (int) Math.pow(2,10)-1;
        for(int i=n-1;i>=0;i--){
            secNum=nums[i]>>10;
            firNum=nums[i] & allOnes;
            nums[2*i+1]=secNum;
            nums[2*i]=firNum;
        }
        return nums;
    }
}
