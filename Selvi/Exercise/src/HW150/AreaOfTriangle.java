package HW150;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double height,breadth,area;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the  height of triangle:");
         height =s.nextDouble();

        System.out.println("enter the breath of the triangle:");
        breadth=s.nextDouble();

         area =(breadth*height)/2;
        System.out.println("area of triangle:"+area);






    }
}
