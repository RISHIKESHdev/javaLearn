package leet_code;

import java.util.Scanner;

public class leet1672 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;i<m;i++){
                nums[i][j]=in.nextInt();
            }
        }
        System.out.println(maximumWealth(nums));
        in.close();

    }
    public static int maximumWealth(int[][] accounts) {
        int ans=0,sum=0;
        for(int i=0; i<accounts.length ; i++){
            sum=0;
            for(int j=0 ; j<accounts[i].length ;j++){
                sum=sum+accounts[i][j];
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
