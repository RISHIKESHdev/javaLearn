package text_processing;

public class TextProcessor {
    public static void main(String[] args){
        countWords("om shiva lord");
        reverseString("om shiva lord");
    }
    public static void countWords(String text){
       String[] words = text.split(" ");
       int numberOfWords = words.length;
       String message = String.format("Your text contains %d words",numberOfWords);
       System.out.println(message); 
    }
    public static void reverseString(String text){
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
}
