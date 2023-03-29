package leet_code;

import java.util.Scanner;

public class leet1502 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(canMakeArithmeticProgression(nums));
        in.close();
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int v : arr) {
            min=Math.min(min, v);
            max=Math.max(max, v);
        }
        if(max==min) return true;
        if((max-min)%(arr.length-1)!=0) return false;
        int diff = (max-min)/(arr.length-1);
        for(int i=0; i<arr.length;) {
            if(arr[i]-min == i*diff) i++;
            else {
                if((arr[i]-min)%diff!=0) return false;
                int j = (arr[i]-min)/diff;
                if(arr[i]==arr[j]) return false;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return true;
    }
}
