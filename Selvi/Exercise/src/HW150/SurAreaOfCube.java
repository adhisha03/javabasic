package HW150;

import java.util.Scanner;

public class SurAreaOfCube {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the side of cube:");
        double side=s.nextDouble();

        double radius=4*side*side;
        System.out.println("the surface area of cube:"+radius);
    }
}
