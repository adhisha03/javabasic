package HW150;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int p = 1;

            System.out.println("enter a value 'a'");
            double num1 = in.nextDouble();

            System.out.println("enter a value 'b'.");
            double  num2 = in.nextDouble();

            System.out.println("operation to perform: +, -, *, /, ^.");
            char  operator = in.next().charAt(0);

            System.out.print("Result :" +num1+operator+num2+"=");

            if(operator=='+'){System.out.print(num1+num2);}
            else  if(operator=='-')
            {
                System.out.print(num1-num2);
            }
            else if(operator=='*'){
                System.out.print(num1*num2);
            }
            else  if(operator=='/'){
                System.out.print(num1/num2);
            }
            else if(operator=='^'){
                for(int i=1; i<=num2; i++){
                    p *= num1;
                } System.out.print(p);
            }
            else{
                System.out.print("enter a valid operator.");
            }

        }
    }

