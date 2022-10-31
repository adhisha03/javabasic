package HW150;

import java.util.Scanner;

public class VolOfCone {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the height of cone:");
        double height=s.nextDouble();

        System.out.println("enter the radius of cone:");
        double radius=s.nextDouble();

        double volume=(22*radius*radius*height)/(3*7);
        System.out.println("the volume of cone:"+volume);
    }
}
