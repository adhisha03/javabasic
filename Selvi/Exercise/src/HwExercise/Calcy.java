package HwExercise;

import java.util.Scanner;

public class Calcy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the 1st number:");
        int x = s.nextInt();

        System.out.println("enter the 2st number:");
        int y = s.nextInt();

        System.out.println("enter the operator:");
        int operator = s.next().charAt(0);


     if(operator=='+') {
         System.out.println("the result is="+add(x,y,operator));
        }
      else if (operator!='-'){
          System.out.println("the result is="+sub(x,y,operator));
      }
      else {
         System.out.println("the result is null");
          }
    }
      static int add(int x,int y,int operartor) {
          int z = (x + y);
          return z;
      }
      static int sub(int x,int y, int operator) {
          int z = (x - y);
          return z;
      }
}










