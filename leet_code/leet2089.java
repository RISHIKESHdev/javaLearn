package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet2089 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,target;
        target=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(targetIndices(nums,target));
        in.close();
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) lessthan++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
        // List<Integer> ans = new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         ans.add(i);
        //     }
        // }
        // return ans;
    }
}
