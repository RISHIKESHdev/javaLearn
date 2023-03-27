package leet_code;

import java.util.Scanner;

public class leet1460 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(canBeEqual(nums,arr));
        in.close();
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        // As long as both arrays contain the exact same elements,
        // one can always transform via a sequence of pair-wise swaps.
        // In other words, one can mimic the insertion sort algorithm
        // to transform the array, provided that arr is just a 
        // permuation of target.
        int[] map = new int[1001];
        for (int t : target) {
            map[t] += 1;
        }
        for (int a : arr) {
            map[a] -= 1;
        }
        for (int m : map) {
            if (m != 0) {
                return false;
            }
        }
        return true;
        // if(target.length != arr.length){
        //     return false;
        // }
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // for(int i=0 ; i<target.length;i++){
        //     if(arr[i]!=target[i]){
        //         return false;
        //     }
        // }
        // return true;
    }
}
