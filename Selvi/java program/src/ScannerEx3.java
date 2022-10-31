import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

//String
//        System.out.println("enter name of x");
//        String x = name.nextLine();
//
//        System.out.println("enter name of y");
//        String y = name.nextLine();
//
//         if (x.equals(y)){
//             System.out.println("the name is equal");
//         }
//         else{
//             System.out.println("the name is not equal");
//         }

//Integer
        System.out.println("enter the first mark");
         int a=name.nextInt();

        System.out.println("enter the second mark");
        int b=name.nextInt();

        if(a>b){
            System.out.println("your mark is ok");

        } if(a<=b){
            System.out.println("your mark is very bad");

        }  if (a==b) {
            System.out.println("equals");

        }
      if(a!=b){
            System.out.println("your mark is not equal");
        }

    }
}

























































































































































































































































