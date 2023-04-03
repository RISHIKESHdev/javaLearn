package leet_code;

import java.util.Scanner;

public class leet1491 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(average(nums));
        in.close();
    }
    public static double average(int[] salary) {
        int n=salary.length,minEle=Integer.MAX_VALUE,maxEle=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<n;i++){
            if(minEle>salary[i]){
                minEle=salary[i];
            }
            if(maxEle<salary[i]){
                maxEle=salary[i];
            }
            sum+=salary[i];
        }
        sum=sum-minEle-maxEle;
        return sum/(n-2);
    }
}
