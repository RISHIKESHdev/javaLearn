package leet_code;

import java.util.Scanner;

public class leet1232 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=in.nextInt();
            }
        }
        System.out.println(checkStraightLine(nums));
        in.close();
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        for(int i=2;i<coordinates.length;i++){
            if((coordinates[1][1]-coordinates[0][1])*(coordinates[i][0]-coordinates[0][0])!=(coordinates[1][0]-coordinates[0][0])*(coordinates[i][1]-coordinates[0][1])){
    return false;
    }
    }
    return true;
    }
}
