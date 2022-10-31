package HW150;

import java.util.Scanner;

public class CgpaPercentage {
    public static void main(String[] args) {
       int num=3;
       double sum=0;
       double CGPA;

       int marks[]=new int[num];
       double grade[]=new double[num];

       marks[0]=89;
       marks[1]=90;
       marks[2]=69;

       for (int i=0;i<num;i++){
           grade[i]=(marks[i]/10);
       }
       for (int i=0;i<num;i++) {
           sum += grade[i];
       }
       CGPA=sum/num;
        System.out.println("the CGPA  is="+CGPA);
        System.out.println("percentage from CGPA is="+CGPA+9.5);




    }
}
