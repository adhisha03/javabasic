package Method150;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter the side1:");
        double side1 = s.nextInt();

        System.out.println("enter the side2:");
        double side2 = s.nextInt();

        System.out.println("enter the side3:");
        double side3 = s.nextInt();
        System.out.println("the area of triangle:" + areaOfTriangle(side1, side2, side3));
    }
    public static double areaOfTriangle(double  side1,double side2,double side3) {
        double area=0;
        double s = (side1 + side2 + side3) / 2;
         area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}


