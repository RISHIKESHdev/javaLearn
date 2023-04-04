package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet228 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(summaryRanges(nums));
        in.close();
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i] + 1 == nums[i+1]){
                if(!flag){
                    sb.append(nums[i]);
                    flag = true;
                }
            } else{
                if(flag){
                    sb.append("->");
                    flag = false;
                }
                sb.append(nums[i]);
                ans.add(sb.toString());
                sb = new StringBuilder();

            }
        }
        return ans;
        // List<String> ans = new ArrayList<>();
        // if(nums.length==0){
        //     return ans;
        // }
        // String sub =nums[0]+"";
        // if(nums.length==1){
        //     ans.add(sub);
        //     return ans;
        // }
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]-nums[i-1]!=1){
        //         if(Integer.parseInt(sub)==nums[i-1]){
        //             ans.add(sub);
        //             sub=""+nums[i];
        //         }
        //         else{
        //             sub=sub+"->"+(nums[i-1]);
        //             ans.add(sub);
        //             sub=""+nums[i];
        //         }
        //     }
        //    if(i==nums.length-1){
        //         if(Integer.parseInt(sub)==nums[i]){
        //             ans.add(nums[i]+"");
        //         }
        //         else{
        //             sub=sub+"->"+(nums[i]);
        //             ans.add(sub);
        //         }
        //     }
        // }
        // return ans;
    }
}
