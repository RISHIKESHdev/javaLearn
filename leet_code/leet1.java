package leet_code;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }
}
