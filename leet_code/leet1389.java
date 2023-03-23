package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leet1389 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int[] nums = new int[n];
        int[] indx = new int[m];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            indx[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(nums,indx)));
        in.close();
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
        int[] ans=new int[index.length];
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
