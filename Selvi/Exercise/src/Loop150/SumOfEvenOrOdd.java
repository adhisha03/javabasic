package Loop150;
import java.util.Scanner;

public class SumOfEvenOrOdd {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int number;
        char choice;
        int even = 0;
        int odd = 0;

        do{
            System.out.print("Enter any number ");
            number = s.nextInt();


            if( number % 2 == 0) {
                even += number;
            }
            else {
                odd += number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = s.next().charAt(0);
            }
            while(choice=='y' || choice == 'Y');
            System.out.println("Sum of even numbers: " + even);
            System.out.println("Sum of odd numbers: " + odd);
    }
}
