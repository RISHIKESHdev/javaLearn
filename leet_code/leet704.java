package leet_code;

import java.util.Scanner;

public class leet704 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,target;
        target=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(search(nums,target));
        in.close();
    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;   
            } 
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
