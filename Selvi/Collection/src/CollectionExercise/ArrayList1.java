package CollectionExercise;
import  java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>s=new ArrayList<Integer>();
        s.add(8);
        s.add(89);
        s.add(87);
        System.out.println(" print the all numbers"+s);

        Iterator s1=s.iterator();

        while (s1.hasNext()){
            System.out.println(s1.next());
        }
        System.out.println(s.get(0));

        s.set(1,100);
        System.out.println("change the number of the index"+s);

        s.remove(1);
        System.out.println("remove index of the number"+s);

        s.contains(89);
        System.out.println(s);

    }
}
