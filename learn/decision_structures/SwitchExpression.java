package decision_structures;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade: ");
        String grade = scanner.next();
        scanner.close();
        String message = switch(grade){
            case "A"->"grade A";
            case "B"->"grade B";
            case "C"->"grade C";
            case "D","E","F"->"grade D,E,F";
            default->"Default case";
        };
        System.out.println(message);
    }
}
