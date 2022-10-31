package HW150;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double length,breath,area;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the length of rectangle:");
        length=s.nextDouble();

        System.out.println("enter the breath of rectangle:");
        breath=s.nextDouble();

        area=length*breath;
        System.out.println("the area of rectangle:"+area);
    }
}
