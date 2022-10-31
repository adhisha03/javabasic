import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);

        //Addition
//        System.out.println("Enter the first Number");
//        int a=num.nextInt();
//
//        System.out.println("Enter the Second Number");
//        int b=num.nextInt();
//
//        int c=a+b;
//        System.out.println("The addition of two Numbers is :"+c);


        //subtraction
        System.out.println("Enter the third number");
        int d=num.nextInt();

        System.out.println("Enter the fourth number");
        int e=num.nextInt();

        int f=d-e;
        System.out.println("the subtraction of two numbers is :"+f);

        //Multiplication
        System.out.println("Enter the fifth number");
        int g=num.nextInt();

        System.out.println("Enter the sixth number");
        int h=num.nextInt();

        int i=g*h;
        System.out.println("the multiplication of two numbers is:"+i);

        //Division
        System.out.println("enter the seventh number");
        int j=num.nextInt();

        System.out.println("enter the eighth number");
        int k=num.nextInt();

        int l=j/k;
        System.out.println("the division of two numbers is: "+l);

        //Modulus
        System.out.println("enter the ninth number");
        int m=num.nextInt();

        System.out.println("enter the tenth number");
        int n=num.nextInt();

        int o=m%n;
        System.out.println("the modulus of two numbers is"+o);



    }
}
