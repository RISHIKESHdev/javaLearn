package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leet1403 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(minSubsequence(nums));
        in.close();
    }
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int sum=0,subSum=0;
        Arrays.sort(nums);
        for(int i:nums){
            sum+=i;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans.add(nums[i]);
            subSum+=nums[i];
            if(subSum>sum-subSum){
                return ans;
            }
        }
        return ans;
    }
}
