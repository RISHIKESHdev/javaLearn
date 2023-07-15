package leet_code;

import java.util.Scanner;

public class leet540 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(singleNonDuplicate(nums));
        in.close();
    }
    public static int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-1,mid;
        if(nums.length%2==0){
            return -1;
        }
        else if(nums.length==1){
            return nums[0];
        }
        while(l<=h){
            mid=(l+h)/2;
            if(mid!=0 && mid!=nums.length-1 && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])return nums[mid];
            else if(mid==0 && nums[mid]!=nums[mid+1]) return nums[mid];
            else if(mid==nums.length-1 && nums[mid]!=nums[mid-1]) return nums[mid];
            else if(nums[mid]==nums[mid-1]){
                if((h-mid+2)%2==0){
                    h=mid-2;
                }else{
                    l=mid+1;
                }
            }
            else if(nums[mid]==nums[mid+1]){
                if((h-mid+1)%2==1){
                    l=mid+2;
                }else{
                    h=mid-1;
                }
            }
            
        }
        return -1;
    }
}
