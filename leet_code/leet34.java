package leet_code;

import java.util.Scanner;

public class leet34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,tar;
        tar=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(searchRange(nums,tar));
        in.close();
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0]=search(nums,target,true);
        if(arr[0]!=-1){
            arr[1]=search(nums,target,false);
        }
        return arr;
    }
    static int search(int[] arr,int tar,boolean firstindx){
        int ans=-1;
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(tar<arr[mid]){
                end=mid-1;
            }
            else if(tar>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstindx){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
