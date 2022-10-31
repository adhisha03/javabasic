package HW150;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        float quizScore,midScore,finalScore,avr;

        Scanner s=new Scanner(System.in);

        System.out.println("enter your quiz score:");
        quizScore=s.nextFloat();

        System.out.println("enter your mid score:");
        midScore=s.nextFloat();

        System.out.println("enter your final score:");
        finalScore=s.nextFloat();

        avr=(quizScore+midScore+finalScore)/3;

        if(avr>=90){
            System.out.println("your grade A.");
        } else if ((avr>=70) && (avr<90)) {
            System.out.println("your grade B.");
        } else if ((avr>=50) && (avr<70)) {
            System.out.println("your grade C.");
        } else if (avr<50) {
            System.out.println("your grade F.");
        }
        else {
            System.out.println("invalid");

        }

    }

    }



