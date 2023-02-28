package basic_DS;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("bannana");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("bannana");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        fruits.set(0,"grape");
        System.out.println(fruits);
        System.out.println("index of first lemon: "+fruits.indexOf("bannana"));
        System.out.println("index of last lemon: "+fruits.lastIndexOf("bannana"));

        //there are two overloaded method for remove
        //remove by object : removes first found element
        //remove by index

        fruits.remove(4);
        System.out.println(fruits);

        List moreFruit = List.of("cherry,plus");
        System.out.println(moreFruit);

    }
}
