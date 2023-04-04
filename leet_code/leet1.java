package leet_code;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class leet1 {
    public static void main(String[] args){
        int n,target;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int[] nums = new int[n];
        target=scanner.nextInt();
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int arr[]=new int[2];
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
        // for(int c = 1; c < nums.length; c++){
        //     for(int i = 0; i + c < nums.length;i++){
        //         if(nums[i] + nums[i + c] == target){
        //             return new int[] {i,i + c};
        //         }
        //     }
        // }
        // return new int[] {};
    }
}
