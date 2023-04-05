package leet_code;

import java.util.Scanner;

public class leet1108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.next();
        System.out.println(defangIPaddr(str));
        in.close();
    }
    public static String defangIPaddr(String address) {
        //address.split(".").join("[.]")
        return address.replace(".","[.]");
    }
}
