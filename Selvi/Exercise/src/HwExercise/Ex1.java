package HwExercise;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the first number:");
        int male=s.nextInt();

        System.out.println("enter the second number:");
        int female=s.nextInt();

        if(male==0) {
            System.out.println("boy");
        }
        else {
            System.out.println("girl");

        }
    }
}
