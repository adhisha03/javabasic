
package Interface;

public class Circle implements Shape{
    public  static int value=100;
    public  final int value1=100;

    @Override
    public void dimenstion(int length,int breath,int height) {
        System.out.println("triangle=" + ""+(length+breath+height) );

    }
    @Override
    public void getStatic() {
        System.out.println("Enter the "+value);
    }

    @Override
    public int getInt(int a,int b,int c) {
        int d=a+b+c;
        System.out.println("Enter the "+d);
        return d;
    }
}
