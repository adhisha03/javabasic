package HW150;

import java.util.Scanner;

public class SurAreaOfCylinder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the height of cylinder:");
        double height=s.nextDouble();

        System.out.println("enter the radius of cylinder:");
        double radius=s.nextDouble();

        double TotalSurfaceArea=((2*22*radius)/7)*(radius+height);
        System.out.println("the total surface area of cylinder:"+TotalSurfaceArea);


    }
}
