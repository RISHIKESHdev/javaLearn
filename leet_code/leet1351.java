package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1351 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       int n,m;
        System.out.print("Enter Row Array size: ");
        m=in.nextInt();
        System.out.print("Enter Column Array size: ");
        n=in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.print("Array: ");
        for(int i=0;i<n;i++) System.out.println(Arrays.toString(arr[i]));
        System.out.println(countNegatives(arr));
        in.close();
    }
    public static int countNegatives(int[][] grid){
        int l=0,r=grid[0].length-1,m=-1,res=0;
        for(int[] row:grid){
            while(l<=r){
                m=(l+r)/2;
                if(row[m]<0) r=m-1;
                else l=m+1;
            }
            res=res+grid[0].length-l;
            l=0;
            r=grid[0].length-1;
            m=-1;
        }
        return res;
    }
}
