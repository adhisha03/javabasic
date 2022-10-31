package CollectionExercise;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList <Integer>alist=new LinkedList<>();
        alist.add(90);
        alist.add(24);
        alist.add(23);
        System.out.println(alist);

        alist.set(2,20);
        System.out.println(alist);

        System.out.println(alist.get(0));

        alist.contains(90);
        System.out.println(alist);

        alist.size();
        System.out.println(alist);

        alist.remove(2);
        System.out.println(alist);

        alist.clear();
        System.out.println(alist);




    }
}
