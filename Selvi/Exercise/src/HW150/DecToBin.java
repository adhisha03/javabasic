package HW150;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        int decimal;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the decimal value:");
        decimal=s.nextInt();

        String binary=Integer.toBinaryString(decimal);
        System.out.println("decimal to binary number is:"+binary);
    }
}
