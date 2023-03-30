package leet_code;

import java.util.Scanner;

public class leet1779 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,x,y;
        x=in.nextInt();
        y=in.nextInt();
        n=in.nextInt();
        int[][] nums = new int[n][];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                nums[i][j]=in.nextInt();
            }
        }
        System.out.println(nearestValidPoint(x,y,nums));
        in.close();
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int minHatten=Integer.MAX_VALUE;
        for(int[] i : points){
            if(i[0]!=x && i[1]!=y){
                continue;
            }
            minHatten=Math.min(minHatten,Math.abs(x-i[0])+Math.abs(y-i[1]));
        }
        for(int i=0;i<points.length;i++){
            if(points[i][0]!=x && points[i][1]!=y){
                continue;
            }
            if(minHatten==Math.abs(x-points[i][0])+Math.abs(y-points[i][1])){
                return i;
            }
        }
        return -1;
    }
}
