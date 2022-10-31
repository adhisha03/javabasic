package HW150;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        double area;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the d1 of height:");
        double d1=s.nextDouble();

        System.out.println("enter the d2 of breath:");
        double d2=s.nextDouble();

        area=(d1*d2);
        System.out.println("the area of parallelogram:"+area);


    }
}
