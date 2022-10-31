package HW150;

import java.util.Scanner;

public class IntGreatNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the first num:");
        int num1=s.nextInt();

        System.out.println("enter the second num:");
        int num2=s.nextInt();

        System.out.println("enter the third num:");
        int num3=s.nextInt();

        if(num1>num2)
            if (num1>num3)
                System.out.println("the num1 greater than num2 and num3:");

        if (num2>num1)
            if(num2>num3)
                System.out.println("the num2 greater than is num1 and num3:");

        if(num3>num1)
            if(num3>num2)
                System.out.println("the num3 greater than num1 and num2:");


    }
}
