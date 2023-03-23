package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet1365 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        in.close();
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        int max=0;
        for(int i=0; i<nums.length; i++) {
            buck[nums[i]] +=1;
            if(max<nums[i]){
                max=nums[i];
            }
        }
        
        for(int j=1; j<= max; j++) {
            buck[j] += buck[j-1];
        }
        
        for(int k=0; k< nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos==0 ? 0 : buck[pos-1];
        }
        
        return nums;
    }
}
