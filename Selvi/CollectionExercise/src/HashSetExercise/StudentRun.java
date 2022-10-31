package HashSetExercise;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentRun {
    public static void main(String[] args) {


        Student s1=new Student("selvi","ond",5);
        Student s2=new Student("udhaya","tanjai",9);
        Student s3=new Student("shuruthi","thekkur",7);
        Student s4=new Student("sundari","mayiladuthurai",7);


        HashSet<Student> studentSet = new HashSet<Student>();
        studentSet.add(s1);
        studentSet.add(s1);
        studentSet.add(s4);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s2);
        studentSet.add(s3);
        System.out.println(studentSet.size());

        ArrayList<Student>studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s1);
        studentList.add(s4);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList.size());


    }
}
