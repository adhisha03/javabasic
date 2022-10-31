package HW150;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=s.nextInt();

        int original=number;
        int check=0;
        int temp=0;

        while(number>0) {
            temp = number % 10;
            check = (check * 10) + temp;
            number = number / 10;
        }

            if(original==check) {
                System.out.println("it is a palindrome number");
            }

                else {
                System.out.println("It is not palindrome number");

            }

            }
        }




