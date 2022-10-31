package CollectionExercise;
import java.util.ArrayList;
public class Collection1 {
    public static void main(String[] args) {
        ArrayList<Student>s=new ArrayList<Student>();
        Student obj=new Student();
        obj.setFirstName("selvi");
        obj.setLastName("udhay");
        obj.setPhnNo("76543");
        s.add(obj);

       for (Student obj1:s){
           System.out.println(obj.getFirstName());
            System.out.println(obj.getLastName());
            System.out.println(obj.getPhnNo());
       }


    }
}
