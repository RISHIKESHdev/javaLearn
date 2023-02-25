package methods;
import java.util.Scanner;
public class InstantCreditCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary :");
        double salary = scanner.nextDouble();
        System.out.println("Enter creditscore :");
        int creditScore = scanner.nextInt();
        scanner.close();
        if(isUserQualified(creditScore,salary)){
            System.out.println("Congrats! you have been approved!");
        }
        else{
            System.out.println("Sorry, you have been declined");
        }
    }

    public static boolean isUserQualified(int creditScore,double salary){
        double requiredSalary=25000;
        int requiredCreditScore = 700;

        if(creditScore>=requiredCreditScore && salary>=requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }
}
