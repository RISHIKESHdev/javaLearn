package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
        in.close();
    }
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
            for(int i = 1; i < n; i += 2){
                arr[i-1] = i;
                arr[i] = -i;
            }
            return arr;
        //  int[] ans = new int[n];
        //  int a=-1,b=1;
        //  if(n%2!=0){
        //      ans[n/2]=0;
        //      for(int i=0;i<n/2;i++){
        //         ans[i]=a;
        //         a-=1;
        //      }
        //      for(int i=n-1;i>n/2;i--){
        //         ans[i]=b;
        //         b+=1;
        //      }
        //  }
        //  else{
        //      for(int i=0;i<n/2;i++){
        //         ans[i]=a;
        //         a-=1;
        //      }
        //      for(int i=n-1;i>=n/2;i--){
        //         ans[i]=b;
        //         b+=1;
        //      }
        //  }
        //  return ans;
        }
}
