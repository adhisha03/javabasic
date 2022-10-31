package HashMapExercise;

import java.util.HashMap;

public class StudentObj {
    public static void main(String[] args) {
        StudentA s1=new StudentA("selvi",23);
        StudentA s2=new StudentA("udhaya",24);
        StudentA s3=new StudentA("shuruthi",25);

        HashMap<Integer,StudentA>studentMap=new HashMap<>();
        studentMap.put(100,s1);
        studentMap.put(120,s2);
        studentMap.put(140,s3);
        System.out.println(studentMap.get(120));
        System.out.println(studentMap.get(140));
        System.out.println(studentMap.get(100));


    }
}
