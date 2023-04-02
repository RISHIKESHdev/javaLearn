package leet_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leet217{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(containsDuplicate(nums));
        in.close();
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],i);
        }
        return false;
    }
}