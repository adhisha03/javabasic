package Loop150;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any number: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);
        for(int i=1; i<=10; i++){
            System.out.println(num +" x " + i + " = " + (num*i));
        }
}
}
