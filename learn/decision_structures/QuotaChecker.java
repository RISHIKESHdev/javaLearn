package decision_structures;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args){
        int quota =10;
        Scanner scanner =new Scanner(System.in);
        System.out.println("How many sales did employee made this year");
        int sales = scanner.nextInt();
        scanner.close();
        if(sales>=quota){
            System.out.println("Congrats! you have met your quota.");
        }
        else{
            System.out.println("Short by "+(quota-sales));
        }
    }
}
