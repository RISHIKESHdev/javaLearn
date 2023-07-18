package leet_code;

import java.util.Scanner;

public class leet74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,target;
        n=in.nextInt();
        m=in.nextInt();
        target=in.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=in.nextInt();
            }
        }
        System.out.println(searchMatrix(nums,target));
        in.close();
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,m=matrix[0].length,ol=0,or=n-1,om=-1;
        while(ol<=or){
            om=(ol+or)/2;
            if(target<matrix[om][0]) or=om-1;
            else if(target>matrix[om][m-1]) ol=om+1;
            else{
                int il=0,ir=m-1,im=-1;
                while(il<=ir){
                    im=(il+ir)/2;
                    if(target>matrix[om][im]) il=im+1;
                    else if(target<matrix[om][im]) ir =im-1;
                    else return true;
                }
                return false;
            }
        }
        return false;
    }
}
