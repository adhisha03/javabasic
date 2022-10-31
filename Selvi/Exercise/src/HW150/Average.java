package HW150;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first num is :");
        int a=s.nextInt();
        System.out.println("enter the second num is:");
        int b=s.nextInt();
        System.out.println("enter the third num is :");
        int c=s.nextInt();
        System.out.println("enter the fourth num is:");
        int d=s.nextInt();
        System.out.println("enter the fifth num is:");
        int e=s.nextInt();
        System.out.println("the average num is:"+(a+b+c+d+e/5));

    }
}
