package leet_code;
import java.util.Scanner;
public class leet70 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println(climbStairs(n));
        scanner.close();
    }
    public static int climbStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] a=new int[n];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}
