package HW150;

import java.util.Scanner;

import static java.lang.Math.pow;

public class CompoundInterest {
    public static void main(String[] args) {
        double amount,rate,time,principal;
        int n=100;
        Scanner s=new Scanner(System.in);

        System.out.println("enter the principal:");
        principal=s.nextDouble();

        System.out.println("enter the rate of interest:");
        rate=s.nextDouble();

        System.out.println("enter the time of compound:");
        time=s.nextDouble();


        amount=principal*Math.pow((1+rate/100),time);
        System.out.println(amount);

    }
}
