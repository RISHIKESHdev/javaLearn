package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(decompressRLElist(nums)));
        in.close();
    }
    public static int[] decompressRLElist(int[] nums) {
        int n=0,j,k=0;
        for(int i=0;i<nums.length;i+=2){
            n+=nums[i];
        }
        int[] ans=new int[n];
        for(int i=0;i<nums.length;i+=2){
            j=nums[i];
            while(j>0){
                ans[k]=nums[i+1];
                k++;
                j--;
            }
        }
        return ans;
    }
}
