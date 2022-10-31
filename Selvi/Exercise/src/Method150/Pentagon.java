package Method150;

import java.util.Scanner;

public class Pentagon {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("enter the number of sides:");
        int n=s.nextInt();

        System.out.println("enter the input sides:");
        int sides=s.nextInt();
        System.out.println("the area of the pentagon is:"+pentagonArea(n,sides));
    }
    public static double pentagonArea(int n,int s){
        return (n*s*s) / (4*Math.tan(Math.PI/n));
    }

}