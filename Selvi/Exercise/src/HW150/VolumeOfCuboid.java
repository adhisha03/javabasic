package HW150;

import java.util.Scanner;

public class VolumeOfCuboid {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);

        System.out.println("enter the radius of length:");
        double length=s.nextDouble();

        System.out.println("enter the radius of breadth:");
        double breadth=s.nextDouble();

        System.out.println("enter the radius of height:");
        double height=s.nextDouble();

         double volume=length*breadth*height;
        System.out.println("the volume of cuboid:"+volume);

    }
}
