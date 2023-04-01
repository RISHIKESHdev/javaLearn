package leet_code;

import java.util.Scanner;

public class leet746 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(minCostClimbingStairs(nums));
        in.close();
    }
    public static int minCostClimbingStairs(int[] cost) {
        var n = cost.length;
        var minCosts = new int[n + 1];
    
        for (var i = 2; i - 1 < n; i++)
            minCosts[i] = Math.min(minCosts[i - 1] + cost[i - 1], 
                                   minCosts[i - 2] + cost[i - 2]);
        return minCosts[n];
    }
}
