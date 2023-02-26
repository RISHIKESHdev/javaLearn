package leet_code;
import java.util.Scanner;
public class leet9 {
    public void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        x=scanner.nextInt();
        System.out.println(isPalindrome(x));
        scanner.close();
    }
    public boolean isPalindrome(int x){
        int z=0;
        int y=x;
        while(y>0){
            z=z*10+y%10;
            y=y/10;
        }
        return x==z;
    }
}
