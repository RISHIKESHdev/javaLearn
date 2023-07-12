package auxProb.binarySearch;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,target;
        target=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(findNearIndx(nums,target));
        in.close();
    }
    public static int findNearIndx(int[] nums,int target){
        int l=0,r=nums.length-1,m=-1;
        while(l<r){
            m=l+(r-l)/2;
            if(nums[m]<target){
                l=m+1;
            }else{
                r=m;
            }
        }
        return l;
    }
}
