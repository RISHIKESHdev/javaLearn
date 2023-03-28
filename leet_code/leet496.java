package leet_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class leet496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        for(int i=0;i<n;i++){
            nums1[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            nums2[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        in.close();
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums2){
            while(!stack.isEmpty() && num> stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int i=0;        
        for(int num : nums1)
            ans[i++] = map.getOrDefault(num, -1);
        return ans;
    }
}
