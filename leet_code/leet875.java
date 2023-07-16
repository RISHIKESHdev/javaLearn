package leet_code;

import java.util.Scanner;

public class leet875 {
    public static void main(String args[]){
        int n,k;
        Scanner in =new Scanner(System.in);
        k=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(minEatingSpeed(nums,k));
        in.close();
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long sum=0;
        for(int i:piles) sum+=i;
        int l=(int)(sum/h),r=(int)(sum/(h-n+1)),m=0;
        while(l<=r){
            m=(l+r)/2;
            if(findHour(piles,h,m)) r=m-1;
            else l=m+1;
        }
        return l;
    }
    public static boolean findHour(int[] piles, int h, int k){
        for (int p : piles) {
			h -= (int)((p + k-1) / (double)k);
			if (h < 0) return false;
		}
		return true;
    }
}
