package HW150;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = s1.nextInt();
        System.out.println("enter the second number:");
        int b = s1.nextInt();
        System.out.println("the product of two num is:" +(a*b));

    }
}
