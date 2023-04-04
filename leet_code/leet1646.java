package leet_code;

import java.util.Scanner;

public class leet1646 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.println(getMaximumGenerated(n));
        in.close();
    }
    public static int getMaximumGenerated(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int maxEle=Integer.MIN_VALUE;
        int[] num = new int[n+1];
        num[0]=0;
        num[1]=1;
        for(int i=2;i<num.length;i++){
            if(i%2==0){
                num[i]=num[i/2];
            }
            else{
                num[i]=num[(i-1)/2]+num[((i-1)/2)+1];
            }
            maxEle=Math.max(maxEle,num[i]);
        }
        return maxEle;
    }
}
