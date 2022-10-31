package HwExercise.com.access.methods;

public class Aprivate {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void myMethod(String name){
        Detail(name);
    }
    private void Detail(String name){
        System.out.println(name);
    }
}
