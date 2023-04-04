package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(nums)));
        in.close();
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] rdigits = new int[digits.length+1];
        rdigits[0]=1;
        return rdigits;
    }
}
