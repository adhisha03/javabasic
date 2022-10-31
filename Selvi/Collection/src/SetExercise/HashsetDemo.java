package SetExercise;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String>obj=new HashSet<>();
        obj.add("apple");
        obj.add("grapes");
        obj.add("orange");
        obj.add("banana");
        obj.add("dragonFruit");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj.containsAll(obj));
        System.out.println(obj.clone());
        System.out.println(obj.contains("apple"));
        System.out.println(obj);
    }
}
