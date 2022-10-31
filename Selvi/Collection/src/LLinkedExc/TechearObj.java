package LLinkedExc;

import java.util.LinkedList;
import java.util.List;


public class TechearObj {
    public static void main(String[] args) {
            Teacher t1 = new Teacher("selvi", "Bsc", "orathanadu", 3, 20);
            Teacher t2 = new Teacher("udhaya", "Msc","orathanadu", 1, 53);
            Teacher t3 = new Teacher("Shruthi", "BE","thanjavur", 6, 30);
            Teacher t4 = new Teacher("dharshini","BA","trichy", 3, 30);
            Teacher t5 = new Teacher("anbu",      "Msc","mannargudi", 8, 47);
            Teacher t6 = new Teacher("janani",     "ME","thanjavur", 6, 35);
            Teacher t7 = new Teacher("suba",        "B.ed","mannargudi", 5, 28);
            Teacher t8 = new Teacher("sowmiya",      "Bsc","orathanadu", 10, 38);
            Teacher t9 = new Teacher("priyanka",      "BE","ThiruVarur", 9, 32);
            Teacher t10 = new Teacher("anu",           "BBA","VadaCheri", 7, 24);

            LinkedList<Teacher> obj = new LinkedList<>();
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
            System.out.println(method1(obj,"thanjavur"));
            System.out.println(method2(obj,"thanjavur", 6));
            System.out.println(method3(obj, "mannargudi", 28));
            System.out.println(method4(obj, "Bsc", 28));
            System.out.println(method5(obj, 30));
        }
        public static int method1(List<Teacher> teach1list, String location) {
            int count = 0;
            int sum=0;
            for (Teacher teacher:teach1list) {
                if (teacher.getLocation() == location) {
                    count++;
                }
            }
            return count;

        }
        public static int method2(List<Teacher>teacher2list,String location,int standard){
            int count=0;
            for (Teacher teacher:teacher2list){
                if (teacher.getLocation()==location && teacher.getStandard() == standard) {
                    count++;
                }
            }
            return count;
        }
        public static  int method3(List<Teacher>teacher3List,String location,int age){
            int count=0;
            int sum=0;
            for (Teacher teacher:teacher3List){
                if (teacher.getLocation()==location ){
                    sum+= teacher.getAge();
                    count++;
                }
            }
            return sum;
        }
        public static int method4(List<Teacher>teacher4List,String degree,int age){
            int count=0;
            for (Teacher teacher:teacher4List){
                if (teacher.getAge()>20 && teacher.getAge()<40){
                    count++;
                }
            }
            return  count;
        }
        public static  int method5(List<Teacher>teacher5List,int age){
            int count=0;
            for (Teacher teacher:teacher5List){
                if (teacher.getAge()<age){
                    count++;
                }
            }
            return count;
        }
    }

