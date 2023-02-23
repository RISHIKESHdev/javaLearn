package loops;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1,num2,sum;
        int terminate=0;
        do{
            System.out.println("Please enter first number");
            num1=scanner.nextDouble();
            System.out.println("Please enter second number");
            num2=scanner.nextDouble();
            sum=num1+num2;
            System.out.println("Sum of two number: "+ sum);
            System.out.println("To terminate press 1 and to continue press 0:");
            terminate=scanner.nextInt();
        }while(terminate!=1);
        scanner.close();
    }
}
