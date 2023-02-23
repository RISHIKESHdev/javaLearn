package loops;
import java.util.Scanner;
public class AverageTestScores {
    public static void main(String[] args){
        int numberOfStudents=2;
        int numberOfTests=3;
        double total=0;
        double score=0;

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<numberOfStudents;i++){
            total=0;
            for(int j=0;j<numberOfTests;j++){
                System.out.println("Enter score of test "+(j+1));
                score = scanner.nextDouble();
                total=total+score;
            }
            System.out.println("Average of student "+(i+1)+" is : "+(total/numberOfTests));
        }
        scanner.close();
    }
}
