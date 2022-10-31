package CollectionExercise;

import java.util.ArrayList;

public class ArrAddAllMethod {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("selvi");
        arrayList.add("udhaya");
        arrayList.add("shruthi");
        System.out.println(arrayList);

        ArrayList<String>list=new ArrayList<>();
        list.add("beautiful");
        list.add("ugly");
        list.add("bad");
        System.out.println(list);

        System.out.println(arrayList.addAll(list));
        System.out.println(arrayList);
    }
}
