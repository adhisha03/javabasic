package HwExercise;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the first number:");
        int a=s.nextInt();

        System.out.println("enter the value of B:");
        int b = s.nextInt();

        System.out.println("enter the value of c:");
        int c = s.nextInt();

        if (a>b && a<c){
            System.out.println("a is equal to b");
        } else if (b>a && b==c) {
            System.out.println("b is equal to a");
        } else if (c==a && c>b) {
            System.out.println("c is equal to a");
        }
        else {
            System.out.println("a,b is the biggest number");
        }


    }

    }

