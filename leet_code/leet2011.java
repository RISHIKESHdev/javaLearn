package leet_code;

import java.util.Scanner;

public class leet2011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        String[] operations = new String[n];
        for(int i=0;i<n;i++){
            operations[i]=in.next();
        }
        System.out.println(finalValueAfterOperations(operations));
        in.close();
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}
