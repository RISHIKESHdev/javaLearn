package leet_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leet1512 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
        in.close();
    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> pairs= new HashMap<>();
        int sum=0,num;
        for(int i=0;i<nums.length;i++){
            num=pairs.getOrDefault(nums[i],0);
            pairs.put(nums[i],num+1);
        }
        for(Map.Entry<Integer,Integer> entry:pairs.entrySet()){
            sum+=combinations(entry.getValue());
        }
        return sum;
    }
    public static int combinations(int size)
    {
        return (size * size - size)/2;
    }
}
