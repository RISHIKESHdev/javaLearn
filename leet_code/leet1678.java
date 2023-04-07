package leet_code;

import java.util.Scanner;

public class leet1678 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.next();
        System.out.println(interpret(str));
        in.close();
    }
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append("o");
                    i++;
                }
                else{
                    sb.append("al");
                    i=i+3;
                }
            }
        }
        return sb.toString();
    }
}
