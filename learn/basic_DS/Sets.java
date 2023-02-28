package basic_DS;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("lemon");
        fruits.add("any");
        System.out.println(fruits);
        System.out.println("have lemon? "+fruits.contains("lemon"));
        fruits.remove("lemon");
        System.out.println("No of elements? "+fruits.size());

        Set moreFruit = Set.of("pear","raisin","cherry");
        //using Set.of() makes object immutable
        System.out.println(moreFruit);
    }
}
