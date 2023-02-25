package text_processing;
import java.util.Scanner;
public class PasswordValidator {
    private static String currentUsername = "johndoe";
    private static String currentPassword = "ABC_1234";

    public static void main(String[] args){
        printPasswordRules();
        boolean valid;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter your new password: ");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        }while(!valid);
        System.out.println("The proposed password is valid");
        scanner.close();
    }
    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirments: ");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a apecial character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }
    public static boolean changePassword(String newPassword){
        boolean valid = true;
        if(newPassword.length()<8){
            System.out.println("Your password must be at least 8 characters");
            return !valid;
        }
        if(newPassword.equals(newPassword.toLowerCase())){
            System.out.println("Your password contains only lowercase");
            return !valid;
        }
        if(newPassword.equals(newPassword.toUpperCase())){
            System.out.println("Your password contains only uppercase");
            return !valid;
        }
        if(newPassword.matches("[a-zA-Z0-9]*")){
            System.out.println("Your password should contain atleast one special character");
            return !valid;
        }
        if(newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            System.out.println("Your password contains username");
            return !valid;
        }
        if(newPassword.equals(currentPassword)){
            System.out.println("Your new password same as old password");
            return !valid;
        }
        return valid;
    }
}
