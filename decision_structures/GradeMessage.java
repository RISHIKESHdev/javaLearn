package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade: ");
        String grade = scanner.next();
        scanner.close();
        String message;
        switch(grade){
            case "A":
                message="grade A";
                break;
            case "B":
                message="grade B";
                break;
            case "C":
                message="grade C";
                break;
            default:
                message = "Default case";
                break;
        }
        System.out.println(message);
    }
}
