package games;
import java.util.Scanner;
import java.util.Random;
public class RollTheDieGame {
    public static void main(String[] args){
        int lastSpace=20;
        int currentSpace=0;
        int maxRolls=5;
        int die=0;
        System.out.println("Welcome");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<maxRolls;i++){
            die = random.nextInt(6)+1;
            currentSpace=currentSpace+die;
            System.out.println("You've rolled a "+die+". You are now on space "+currentSpace+" and have "+(lastSpace-currentSpace)+" more to go.");
            if(currentSpace==lastSpace){
                System.out.println("You are at 20. Won !!!");
                break;
            }
        }
        if(currentSpace>lastSpace){
            System.out.println("You are over 20 space. try again");
        }
        else if(currentSpace<lastSpace){
            System.out.println("You are short 20 space. try again");
        }
        scanner.close();
    }
}