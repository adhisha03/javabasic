package HW150;

import java.util.Scanner;

public class CheckNumEqualOrDiff {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter 1st num:");
        int num1=s.nextInt();

        System.out.println("enter 2nd num:");
        int num2=s.nextInt();

        System.out.println("enter 3rd num:");
        int num3=s.nextInt();

        if (num1==num2 && num1==num3){
            System.out.println("all numbers are equal");
        }
        else if(num1==num2 || num1==num3 || (num3==num2)){
            System.out.println(" neither all are equal or different");
        }
        else {
            System.out.println("all numbers are different");
        }
    }
}
