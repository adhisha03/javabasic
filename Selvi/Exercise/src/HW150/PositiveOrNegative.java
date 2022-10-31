package HW150;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the number:");
        int a=s.nextInt();

        if(a>0){
            System.out.println("the number are positive");
        }
        else if (a<0) {
            System.out.println("the number are negative");
        }
        else{
            System.out.println("number is zero");


        }
    }
}
