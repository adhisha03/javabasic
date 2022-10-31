package HW150;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
         double area;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the diagonal d1:");
        double d1=s.nextDouble();

        System.out.println("enter the diagonal d2:");
        double d2=s.nextDouble();

        area=(d1*d2)/2;
        System.out.println("the area of rhombus:"+area );
    }
}
