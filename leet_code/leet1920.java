package leet_code;
import java.util.Arrays;
import java.util.Scanner;
public class leet1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(solution(nums)));
        in.close();
    }
    public static int[] solution(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+(nums[nums[i]]%1024)*1024;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]/1024;
        }
        return nums;
    }
}