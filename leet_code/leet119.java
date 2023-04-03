package leet_code;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leet119 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.println(getRow(n));
        in.close();
    }
    public static List<Integer> getRow(int rowIndex) {
        Integer[] arr = new Integer[rowIndex+1];
        Arrays.fill(arr,0);
        arr[0]=1;
        for(int i=0;i<=rowIndex;i++){
            for(int j=i;j>0;j--){
                arr[j]=arr[j]+arr[j-1];
            }
        }
        return Arrays.asList(arr);
    }
}
