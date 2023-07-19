package leet_code;

import java.util.Scanner;

public class leet2560 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        n=in.nextInt();
        k=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(minCapability(nums,k));
        in.close();
    }
    public static int minCapability(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int l=min,r=max,m=-1;
        while(l<r){
            m=(l+r)/2;
            if(isPossible(nums,m,k)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    public static boolean isPossible(int[] nums,int mid,int k){
        int lastStolenIndex = -2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid && lastStolenIndex + 1 < i){
                lastStolenIndex=i;
                k=k-1;
                if(k==0) return true;
            }
        }
        return false;
    }
}
