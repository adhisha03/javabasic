package HW150;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the radius of cylinder: ");
        double radius=s.nextDouble();

        System.out.println("enter the height of cylinder:");
        double height=s.nextDouble();

        double volume=((22*radius*radius*height)/7);
        System.out.println("the volume of cylinder:"+volume);

    }
}
