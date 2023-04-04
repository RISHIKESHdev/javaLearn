package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1984 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        k=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(minimumDifference(nums,k));
        in.close();
    }
    public static int minimumDifference(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=k-1;i<nums.length;i++){
            ans=Math.min(ans,nums[i]-nums[i-(k-1)]);
        }
        return ans;
    }
}
