package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet31 {
    public static void main(String[] args){
        int n;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        in.close();
    }
    public static void nextPermutation(int[] nums) {
        int ind1=-1,ind2=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                ind1=i-1;
                break;
            }
        }
        if(ind1==-1){
            reverse(nums,0);
        }else{
            for(int i=nums.length-1;i>ind1;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }
            swap(nums,ind1,ind2);
            reverse(nums,ind1+1);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int i){
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
