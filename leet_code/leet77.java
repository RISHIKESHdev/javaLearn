package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet77 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt(),k=in.nextInt();
        System.out.println(combine(n,k));
        in.close();
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(1,n,k,new ArrayList<Integer>(),result);
        return result;
    }
    private static void generateCombinations(int start, int n, int k, List<Integer> combination, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            combination.add(i);
            generateCombinations(i + 1, n, k - 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}
