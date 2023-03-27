package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet977 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(sortedSquares(nums)));
        in.close();
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i=0,j=nums.length-1,s1=0,s2=0;
        int l=nums.length-1;
        while(i<=j){
            s1=nums[i]*nums[i];
            s2=nums[j]*nums[j];
            if(s1<s2){
                ans[l--]=s2;
                j--;
            }else{
                ans[l--]=s1;
                i++;        
            }
        }
        return ans;
    }
}
