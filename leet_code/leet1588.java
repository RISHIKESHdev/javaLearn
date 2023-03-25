package leet_code;

import java.util.Scanner;

public class leet1588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(sumOddLengthSubarrays(nums));
        in.close();
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length,ans=0,odd;
        // int left,right,even;
        for(int i=0;i<n;i++){
            // even=((i+1)*(n-i))/2;
            odd=((i+1)*(n-i)+1)/2;
            ans+=arr[i]*odd;
            // left=i;
            // right=n-1-i;
            // ans += arr[i] * (left / 2 + 1) * (right / 2 + 1);
            // ans += arr[i] * ((left + 1) / 2) * ((right + 1) / 2);
        }
        return ans;
    }
}
