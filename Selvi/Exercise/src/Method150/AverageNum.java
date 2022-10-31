package Method150;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first num:");
        double num1=s.nextInt();
        System.out.println("enter the second num");
        double num2=s.nextInt();
        System.out.println("enter the third num");
        double num3=s.nextInt();
        System.out.println("average value is:"+AverageNum(num1,num2,num3));

    }
    public static double AverageNum(double num1,double num2,double num3){
        return (num1+num2+num3) /3;
        }
        }

