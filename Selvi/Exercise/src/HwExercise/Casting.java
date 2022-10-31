package HwExercise;

public class Casting {
    public static void main(String[] args){
//        widening-->small to large
        int num1=20;
        double num2=20.0d;
        num1=(int) num2;
        System.out.println(num1);

        int a=200;
        float b=10.2f;
        a=(int) b;
        System.out.println(a);

        float per1=99.3f;
        double per2=90.2d;
        per1=(float)per2;
        System.out.println(per1);

//        Narrowig-->larger to small
         double per3=67.1387d;
         float per4=89.23f;
         per4=(float)per3;
        System.out.println(per4);

        float per5=89.566f;
        double per6=79.2687d;
        per6=(double) per5;
        System.out.println(per6);

        double per7=78.43298d;
        int per8=56;
        per8=(int)per7;
        System.out.println(per8);



    }
    
}
