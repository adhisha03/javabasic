package HW150;

import java.util.Scanner;

public class NumOfDaysInMonth {
    public static void main(String[] args) {
         int NumberOfDaysInMonth=0;
         String MonthName="unknown";

        Scanner s=new Scanner(System.in);

        System.out.println("enter the month number:");
        int month=s.nextInt();

        System.out.println("enter the year:");
        int year=s.nextInt();

        switch (month) {
            case 1:
                MonthName = "janaury";
                NumberOfDaysInMonth = 31;
                break;

            case 2:
                MonthName = "march";
                NumberOfDaysInMonth = 31;
                break;
            case 3:
                MonthName = "april";
                NumberOfDaysInMonth = 30;
                break;

            case 4:
                MonthName = "may";
                NumberOfDaysInMonth = 31;
                break;

            case 5:
                MonthName = "june";
                NumberOfDaysInMonth = 30;
                break;
        }
        System.out.println(MonthName+" "+year+"has"+NumberOfDaysInMonth+"days=");


        }



    }

