package HW150;

import java.util.Scanner;

public class MultiTableOfInteger {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number of terms");

        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        System.out.println("the numbers are");

        for (int i=0;i<=num;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
