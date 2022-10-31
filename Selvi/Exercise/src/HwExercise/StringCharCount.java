package HwExercise;

import java.util.Scanner;

public class StringCharCount {
    public static void main(String[] args) {
        String name="jackend jill rent up the hill came back in the evening";
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the char is:");
        char[] name2=name.toCharArray();
        char a= sc.next().charAt(0);

        
        int count=0;

        for (int i=0;i<name2.length;i++) {
            if (name2[i] == a) {
                count++;
            }
        }
            System.out.println(count);
        }


    }

