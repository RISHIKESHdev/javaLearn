package basic_DS;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("banana",20);
        fruitCalories.put("lemon",105);
        fruitCalories.put("banana",45);//overrides existing value
        fruitCalories.putIfAbsent("lemon", 17);

        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("banana"));
        fruitCalories.remove("apple");
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.containsKey("apple"));
        System.out.println(fruitCalories.containsValue(95));

        Map immutableFruitCalories = Map.of("apple",95,"lemon",20);

        Set mapEntries = fruitCalories.entrySet();
        Set mapKeys = fruitCalories.keySet();
        Collection mapValues = fruitCalories.values();

        System.out.println(mapEntries);
        System.out.println(mapKeys);
        System.out.println(mapValues);
    }
}
