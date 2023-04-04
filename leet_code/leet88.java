package leet_code;

import java.util.Arrays;
import java.util.Scanner;

public class leet88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for(int i=0;i<m;i++){
            nums1[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i]=in.nextInt();
        }
        merge(nums1,m,nums2,n);
        in.close();
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1,b=n-1,insIdx=m+n-1;
        while(b>=0){
            if(a>=0 && nums1[a]>nums2[b]){
                nums1[insIdx]=nums1[a];
                a--;
                insIdx--;
            }
            else{
                nums1[insIdx]=nums2[b];
                b--;
                insIdx--;
            }
        }
        Arrays.toString(nums1);
    }
}
