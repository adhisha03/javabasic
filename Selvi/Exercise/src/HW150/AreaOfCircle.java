package HW150;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius,area;
        Scanner input=new Scanner(System.in);

        System.out.println("enter the radius of circle:");
        radius=input.nextDouble();

        area=Math.PI*radius*radius;
        System.out.println("area of the circle:"+area);
    }
}
