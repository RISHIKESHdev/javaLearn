package leet_code;

import java.util.Scanner;

public class leet35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,target;
        target=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(searchInsert(nums,target));
        in.close();
    }
    public static int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1,m=0;
        if(target<=nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        if(target==nums[nums.length-1]) return nums.length-1;
        while(l<=h){
            m=l+(h-l)/2;
            if(nums[m]>target){
                h=m-1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else if(nums[m]==target){
                return m;
            }
        }
        return l;
    }
}
