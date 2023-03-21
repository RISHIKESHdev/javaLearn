package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));
        in.close();
    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr= new int[2*n];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i%n];
        }
        return arr;
    }
}
