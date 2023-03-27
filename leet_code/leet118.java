package leet_code;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leet118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        System.out.println(generate(n));
        in.close();
    }
    public static List<List<Integer>> generate(int numRows) {
        int jag[][] = new int[numRows][];
        // System.out.println(jag);
        for(int i=0;i<numRows;i++){
            int temp[] = new int[i+1];
            temp[0]=1;
            for(int j=1;j<i;j++){
                temp[j]=jag[i-1][j-1]+jag[i-1][j];
                System.out.println(temp[j]);
            }
            temp[i]=1;
            jag[i]=temp;
        }
        return (List)Arrays.asList(jag);
    }
}
