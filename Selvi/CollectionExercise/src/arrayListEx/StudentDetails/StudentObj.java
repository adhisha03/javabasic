package arrayListEx.StudentDetails;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

import static arrayListEx.StudentDetails.Students.*;

public class StudentObj {
    public static void main(String[] args) {
        Students student1 = new Students("selvi", "1900S01", "female", true, "ond", 4, false, 8778, 1);
        Students student2 = new Students("udhaya", "1900S02", "female", false, "ond", 19, true, 56342, 12);
        Students student3 = new Students("shurithi", "1900S03", "female", false, "thanjai", 17, true, 342673, 12);
        Students student4 = new Students("dharshni", "1900S04", "female", true, "tanjai", 5, true, 2903847, 1);
        Students student5 = new Students("vinitha", "1900S05", "female", false, "namakkal", 16, true, 234667, 9);
        Students student6 = new Students("ahalya", "1900S06", "male", true, "trichy", 13, true, 986325, 8);
        Students student7 = new Students("sundari", "1900S07", "female", true, "thiruvarur", 18, true, 457283920, 12);
        Students student8 = new Students("tharani", "1900S08", "female", true, "puthur", 10, true, 9876542, 5);
        Students student9 = new Students("shenbak", "1900S09", "male", false, "ond", 8, false, 73528201, 4);
        Students student10 = new Students("pradeep", "1900S10", "male", true, "ond", 10, false, 432590753, 5);
        Students student11 = new Students("raj", "1900S11", "male", false, "tanjai", 9, true, 37338798, 4);
        Students student12 = new Students("elancheran", "1900S12", "male", true, "trichy", 7, false, 764328, 2);
        Students student13 = new Students("jothika", "1900S13", "female", true, "ond", 12, false, 9864321, 6);
        Students student14 = new Students("sanjay", "1900S14", "male", false, "ond", 16, false, 9089646, 11);
        Students student15 = new Students("prithvi", "1900S15", "male", true, "thiruvarur", 10, false, 987653, 5);

        ArrayList<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);

        System.out.println("Student standard count:" + getByStandardCount(students, 5));
        System.out.println("Student gender count:" + GenderCount(students, "male"));
        System.out.println("student standerd with gender count:" + StandGenderCount(students, 1, "female"));
        System.out.println("student total age:" + Totalage(students, 10));
        System.out.println("student age count with standard:" + StudentAgeCount(students, 19));

        System.out.println(printName(students)+"student name starts with 's':");
        System.out.println(WearSpecs(students));

    }
}




