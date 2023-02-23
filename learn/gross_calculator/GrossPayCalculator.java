package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        int hours = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours did you work?");
        hours = scanner.nextInt();
        double payRate = 0;
        System.out.println("Please enter payrate");
        payRate = scanner.nextDouble();
        double grossPay = hours*payRate;
        System.out.println("gross pay:"+grossPay);
        scanner.close();
    }
}
