package HW150;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the integers:");
        int a = s.nextInt();
        System.out.println("the sum of the digits is:" +sumdigits (a));
    }
   public static int sumdigits(int num) {
       int sum = 0;
       while (num != 0) {
           sum += num % 10;
           num /= 10;
       }
           return sum;


       }


   }








