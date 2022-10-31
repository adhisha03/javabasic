package HW150;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        double area;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the area of equilateral triangle:");
        area=s.nextDouble();

        area=(Math.sqrt(3)/4)*(area*area);
        System.out.println("the equilateral triangle area of:"+area);

    }
}
