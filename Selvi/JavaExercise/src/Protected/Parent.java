package Protected;

public class Parent {
    protected String name="maha";
    protected void display(){
        System.out.println("she is my cutie");
    }

    public static void main(String[] args) {
       Parent parent=new Parent();
        System.out.println(parent.name);
        parent.display();
    }
}

