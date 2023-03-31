package leet_code;

import java.util.Scanner;

public class leet1822 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(arraySign(nums));
        in.close();
    }
    public static int arraySign(int[] nums) {
        int signCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                signCount+=1;
            }
        }
        return (signCount%2==0)?1:-1;
    }
}
