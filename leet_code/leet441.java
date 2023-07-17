package leet_code;

import java.util.Scanner;

public class leet441 {
    public  static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(arrangeCoins(n));
    in.close();
}
 public static int arrangeCoins(int n) {
    long left = 0, right = n;
    long k, curr;
    while (left <= right) {
      k = left + (right - left) / 2;
      curr = k * (k + 1) / 2;

      if (curr == n) return (int)k;

      if (n < curr) {
        right = k - 1;
      } else {
        left = k + 1;
      }
    }
    return (int)right;
  }
}
