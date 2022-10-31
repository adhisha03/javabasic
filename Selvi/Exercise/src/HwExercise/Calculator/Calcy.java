package HwExercise.Calculator;

public class Calcy {

    private int a;
    private int b;
    Calcy(int a,int b) {
        this.a = a;
        this.b = b;

    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }
    public  int sub(){
       return a-b;
    }
    public   int modulus(){
        return a%b;
    }
    public int division(){
      return a/b;
    }

}
