package leet_code;

import java.util.Scanner;

public class leet1051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(heightChecker(nums));
        in.close();
    }
    public static int heightChecker(int[] heights) {
        int[] chkCount=new int[101];
        for(int i:heights){
            chkCount[i]+=1;
        }
        int j=0,ans=0;
        for(int i=0;i<chkCount.length;i++){
            while(chkCount[i]>0){
                if(heights[j++]!=i){
                ans+=1;
            }
            chkCount[i]--;
            }
        }
        return ans;
    }
}
