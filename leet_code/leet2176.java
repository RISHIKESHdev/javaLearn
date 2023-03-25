package leet_code;

import java.util.Scanner;

public class leet2176 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        k=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(countPairs(nums,k));
        in.close();
    }
    public static int countPairs(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] & (i*j)%k==0){
                    ans+=1;
                }
            }    
        }
        return ans;
    }
}
