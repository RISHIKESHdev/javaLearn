package leet_code;

import java.util.Scanner;

public class leet1528 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        s=in.next();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(restoreString(s,nums));
        in.close();
    }
    public static String restoreString(String s, int[] indices) {
        char temp[] = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {
			temp[indices[i]] = s.charAt(i);
		}
		return new String(temp);
    }
}
