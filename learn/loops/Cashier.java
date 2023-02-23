package loops;
import java.util.Scanner;
public class Cashier {
    public static void main(String[] args){
        double total=0;
        int quantity,j;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total quantity");
        quantity = scanner.nextInt();
        for(int i=0;i<quantity;i++){
            j=i+1;
            System.out.println("Please enter price of item "+ j);
            total=total+scanner.nextDouble();
        }

        System.out.println("Total price: "+total);
        scanner.close();
    }
}
