package decision_structures;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        int salary = 1000;
        Scanner scanner =new Scanner(System.in);
        System.out.println("How many sales did employee made this year");
        int sales = scanner.nextInt(); 
        System.out.println("Please mention the quota");
        int quota = scanner.nextInt(); 
        scanner.close();
        if(sales>quota){
            salary = salary + (salary*(sales-quota));
        }
        System.out.println(salary);
    }
}
