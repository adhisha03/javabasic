package HW150;

import java.util.Scanner;

public class SurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the height of cuboid:");
        double height=s.nextDouble();

        System.out.println("enter the breadth of cuboid:");
        double breadth=s.nextDouble();

        double area=(2*((1*breadth)+(breadth*height)+(height*1)));
        System.out.println("the surface area of cuboid:"+area);



    }
}

