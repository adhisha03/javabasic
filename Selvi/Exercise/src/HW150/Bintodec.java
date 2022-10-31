package HW150;

import java.util.Scanner;

public class Bintodec {
    public static void main(String[] args) {
        String binary;
        int decimal;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the binary value:");
        binary=s.nextLine();

        decimal=Integer.parseInt(binary,4);
        System.out.println("Binery to decimal number is:"+decimal);

    }
}
