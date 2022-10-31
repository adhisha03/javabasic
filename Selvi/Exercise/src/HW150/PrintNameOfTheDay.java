package HW150;

import java.util.Scanner;

public class PrintNameOfTheDay {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the number of the day:");
        int day= s.nextInt();

        if(day==1){
            System.out.println("monday");
        }
        if(day==2){
            System.out.println("tuesday");
        }
        if(day==3){
            System.out.println("Wednesay");
        }
        if (day==4){
            System.out.println("thursday");
        }
        if(day==5){ 
            System.out.println("friday");
        }
    }
}
