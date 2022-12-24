package decision_structures;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score: ");
        double score = scanner.nextDouble();
        scanner.close();
        char grade;
        if(score<60){
            grade='F';
        }
        else if(score<70){
            grade='D';
        }
        else{
            grade='A';
        }
        System.out.println(grade);
    }
}
