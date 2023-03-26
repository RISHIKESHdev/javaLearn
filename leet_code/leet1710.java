package leet_code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class leet1710 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,size;
        size=in.nextInt();
        n=in.nextInt();
        m=in.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=in.nextInt();
            }
        }
        System.out.println(maximumUnits(nums,size));
        in.close();
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,Comparator.comparingInt(o -> -o[1]));
        int ans=0, i = 0, n = boxTypes.length;
        while(truckSize>0 & i<n){
            int maxi = Math.min(boxTypes[i][0], truckSize);
			ans += maxi * boxTypes[i][1];
			i++;
			truckSize -= maxi;
        }
        return ans;
        // Arrays.sort(boxTypes, new Comparator<int[]>() {
        //     public int compare(int[] idx1, int[] idx2) {
        //         return Integer.compare(idx2[1], idx1[1]);
        //     }
        // });
    }
}
