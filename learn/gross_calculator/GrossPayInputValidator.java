package gross_calculator;
import java.util.Scanner;
public class GrossPayInputValidator {
    public static void main(String[] srgs){
        int payRate=15;
        int maxHours=40;

        System.out.println("How many hours employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        while(hoursWorked>maxHours){
            System.out.println("Please select a valid input");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        
        double gross = payRate*hoursWorked;
        System.out.println("Gross pay: $"+gross);
    }
}
