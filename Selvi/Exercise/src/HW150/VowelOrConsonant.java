package HW150;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter any alphabet:");
        String input=s.next().toLowerCase();

        boolean uppercase=input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean lowercase=input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean vowels=input.equals("a") ||
                       input.equals("e") ||
                       input.equals("i") ||
                       input.equals("o") ||
                       input.equals("u");
        if (input.length()>1){
            System.out.println("not a single character");
        } else if (!(uppercase || lowercase)) {
            System.out.println("not a letter.Entre uppercase");
        } else if (vowels) {
            System.out.println("input letter is vowel");
        }
        else {
            System.out.println("input letter is consonant");

        }

    }

    }

