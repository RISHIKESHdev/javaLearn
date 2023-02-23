package loops;
import java.util.Scanner;
public class LetterSearch {
    public static void main(String[] args){
        boolean letterFound=false;
        char a;
        String text;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text :");
        text=scanner.next();
        System.out.println("Enter a letter to find");
        a=scanner.next().charAt(0);
        scanner.close();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==a){
                letterFound=true;
                break;
            }
        }
        if(letterFound){
            System.out.println("letter found");
        }
        else{
            System.out.println("Try again");
        }
    }
}
