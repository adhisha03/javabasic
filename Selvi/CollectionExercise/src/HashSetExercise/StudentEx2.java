package HashSetExercise;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentEx2 {
    public static void main(String[] args) {
        HashSet<String>string=new HashSet<>();
        string.add("selvi");
        string.add("shuruthi");
        string.add("selvi");
        string.add("udhaya");
        System.out.println(string.size());
        System.out.println(string);

        ArrayList<String>stringList=new ArrayList<>();
        stringList.add("selvi");
        stringList.add("shuruthi");
        stringList.add("selvi");
        stringList.add("udhaya");
        System.out.println(stringList.size());
        System.out.println(stringList);

    }
}
