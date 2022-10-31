package HwExercise;

import java.util.Scanner;

public class CharPosition {
    public static void main(String[] args) {
        String name="jack end jill rent up the hill came back in the evening";
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the char is:");
        char[] name2=name.toCharArray();
        char a= sc.next().charAt(0);


        for (int i=0;i<name2.length;i++) {
            if (name2[i] == a)
                System.out.println(i);

        }

    }
}

