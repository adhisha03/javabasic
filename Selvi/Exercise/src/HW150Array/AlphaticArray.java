package HW150Array;

import java.util.Scanner;

public class AlphaticArray {
    public static void main(String[] args) {
        int num;
        String temp;
        Scanner s=new Scanner(System.in);

        System.out.println("enter number of names you want to enter:");
        num=s.nextInt();
        String names[]=new  String[num];

        Scanner s1=new Scanner(System.in);
        System.out.println("enter all the names:");

        for(int i=0;i<num;i++){
            names[i]= s1.nextLine();
        }
        for (int i=0;i<num;i++){
            for (int j=i+1;j<num;j++){

                if(names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println("names sorted :");
        for (int i = 0; i < num - 1; i++) {
            System.out.println(names[i]);
        }
        System.out.println(names[num-1]);
    }
}

