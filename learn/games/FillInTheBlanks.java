package games;
import java.util.Scanner;
public class FillInTheBlanks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets create a story!");
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        System.out.println("Enter a season of the year");
        String season = scanner.next();
        System.out.println("Enter a whole number");
        int number= scanner.nextInt();
        System.out.println("result: "+adjective+season+number);
        scanner.close();
    }
}
