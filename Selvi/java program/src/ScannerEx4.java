import java.util.Scanner;
public class ScannerEx4 {
    public static void main(String[] args){
   Scanner num=new Scanner(System.in);
        System.out.println("entered the divided value ");
        int dividend=num.nextInt();
        System.out.println("enter the divisor value");
        int divisor=num.nextInt();
       // int dividend;
       // int divisor;
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("the quotient is"+quotient);
        System.out.println("the remainder is"+remainder);



    }
}
