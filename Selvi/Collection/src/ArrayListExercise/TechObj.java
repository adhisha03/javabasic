package ArrayListExercise;

import java.util.ArrayList;
import java.util.List;


class TeachObj{
       public static void main(String[] args) {
           Teacher1 t1 = new Teacher1("selvi", "Bsc", "orathanadu", 3, 20);
           Teacher1 t2 = new Teacher1("udhaya", "Msc", "orathanadu", 1, 53);
           Teacher1 t3 = new Teacher1("Shruthi", "BE", "thanjavur", 6, 30);
           Teacher1 t4 = new Teacher1("dharshini", "BA", "trichy", 3, 30);
           Teacher1 t5 = new Teacher1("anbu", "Msc", "mannargudi", 8, 47);
           Teacher1 t6 = new Teacher1("janani", "ME", "thanjavur", 6, 35);
           Teacher1 t7 = new Teacher1("suba", "B.ed", "mannargudi", 5, 28);
           Teacher1 t8 = new Teacher1("sowmiya", "Bsc", "orathanadu", 10, 38);
           Teacher1 t9 = new Teacher1("priyanka", "BE", "ThiruVarur", 9, 32);
           Teacher1 t10 = new Teacher1("anu", "BBA", "VadaCheri", 7, 24);


           ArrayList<Teacher1> obj = new ArrayList<>();
           obj.add(t1);
           obj.add(t2);
           obj.add(t3);
           obj.add(t4);
           obj.add(t5);
           obj.add(t6);
           obj.add(t7);
           obj.add(t8);
           obj.add(t9);
           obj.add(t10);
           System.out.println(method1(obj, "thanjavur"));
           System.out.println(method2(obj, "thanjavur", 6));
           System.out.println(method3(obj, "mannargudi", 28));
           System.out.println(method4(obj, "Bsc", 28));
           System.out.println(method5(obj, 30));
       }
           public static int method1(List<Teacher1> teach1list, String location) {
               int count = 0;
               int sum=0;
               for (Teacher1 teacher:teach1list) {
                   if (teacher.getLocation() ==location) {
                       count++;
                   }
               }
               return count;
           }
           public static int method2(List<Teacher1>teacher2list,String location,int standard){
               int count=0;
               for (Teacher1 teacher:teacher2list){
                   if (teacher.getLocation()==location && teacher.getStandard() == standard) {
                       count++;
                   }
               }
               return count;
           }
           public static  int method3(List<Teacher1>teacher3List,String location,int age){
               int count=0;
               int sum=0;
               for (Teacher1 teacher:teacher3List){
                   if (teacher.getLocation()==location ){
                       sum+= teacher.getAge();
                       count++;
                   }
               }
               return sum;
           }
           public static int method4(List<Teacher1>teacher4List,String degree,int age){
               int count=0;
               for (Teacher1 teacher:teacher4List){
                   if (teacher.getAge()>20 && teacher.getAge()<40){
                       count++;
                   }
               }
               return  count;
           }
           public static  int method5(List<Teacher1>teacher5List,int age){
               int count=0;
               for (Teacher1 teacher:teacher5List){
                   if (teacher.getAge()<age){
                       count++;
                   }
               }
               return count;
       }
}




