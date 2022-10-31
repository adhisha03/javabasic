package HwExercise.com.access.classes;

public class Aprivate {


    private class Example {
        String name;
        void detail() {
            System.out.println("selvi");
        }
    }
    void display_Inner(){
        Example ex=new Example();
        ex.detail();
    }
}
