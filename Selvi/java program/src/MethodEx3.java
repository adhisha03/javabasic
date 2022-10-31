import java.util.Scanner;
public class MethodEx3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first password");
        int num=sc.nextInt();

        System.out.println("enter the confirm password");
        int num1=sc.nextInt();


        if(sc.equals(num)) {
            System.out.println("the password is match");
        }else{
            System.out.println("the password is not match");

        }
    }
}
