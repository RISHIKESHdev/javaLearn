package leet_code;

import java.util.Scanner;

public class leet1534 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(countGoodTriplets(nums,a,b,c));
        in.close();
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int output = 0;
        
        for(int i = 0; i < arr.length -2; i++)
            for(int j = i+1; j < arr.length -1; j++)
                if(Math.abs(arr[i] - arr[j]) <= a)
                    for(int k = j+1; k < arr.length; k++)
                        if(Math.abs(arr[j] - arr[k]) <= b)
                            if(Math.abs(arr[i] - arr[k]) <= c)
                                output++;

        return output;
    }
}
