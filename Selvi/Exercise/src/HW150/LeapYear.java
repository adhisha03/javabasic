package HW150;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the year=");
        int year=s.nextInt();

        boolean a=(year%4)==0;
        boolean b=(year%100)!=0;
        boolean c=((year%400)==0)&&(year%100==0);

        if (a && (b || c)) {
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not leap year");
        }


    }
}
