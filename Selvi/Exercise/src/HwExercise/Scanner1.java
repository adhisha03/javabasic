package HwExercise;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("enter the first number x:");
        int x=s1.nextInt();
        System.out.println("enter the second number y:");
        int y=s1.nextInt();
//        addition
        int z=x+y;
        System.out.println("Additon:"+z);
//        subtraction
        int A=x-y;
        System.out.println("subtraction:"+A);
//        multiplication
        int B=x*y;
        System.out.println("multi:"+B);
//        division
        double c=x/y;
        System.out.println("Quotient:"+c);
//        modulus
        int D=x%y;
        System.out.println("remainder:"+D);




        }
    }

