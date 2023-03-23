package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,first;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        first=in.nextInt();
        System.out.println(Arrays.toString(decode(nums,first)));
        in.close();
    }
    public static int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=encoded[i]^arr[i];
        }
        return arr;
    }
}
