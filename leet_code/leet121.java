package leet_code;

import java.util.Scanner;

public class leet121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(maxProfit(nums));
        in.close();
    }
    public static int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int ans=0;
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i=j;
                j++;
            }
            else{
                ans=Math.max(ans,prices[j]-prices[i]);
                j++;
            }
        }
        return ans;
    }
}
