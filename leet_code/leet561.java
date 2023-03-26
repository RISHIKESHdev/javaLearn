package leet_code;

import java.util.Scanner;

public class leet561 {
    final static int k=10000;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(arrayPairSum(nums));
        in.close();
    }
    public static int arrayPairSum(int[] nums) {
        int[] eleCount = new int[2*k+1];
        for(int ele:nums){
            eleCount[ele+k]++;
        }

        int maxSum=0;
        boolean isEven=true;
        for(int i=0;i<=2*k;i++){
            while(eleCount[i]>0){
                maxSum+=(isEven?i-k:0);
                isEven = !isEven;
                eleCount[i]--;
            }
        }
        return maxSum;     
    }
}
