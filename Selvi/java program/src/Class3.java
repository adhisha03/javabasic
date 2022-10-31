import java.util.Scanner;
public class Class3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String a=sc.nextLine();
        System.out.println("enter the address");
        String b=sc.nextLine();
        System.out.println("enter the age");
        int c=sc.nextInt();
        System.out.println("enter the phNo");
        int d=sc.nextInt();

        Class4 obj=new Class4();
        obj.name=a;
        System.out.println("the name you entered is:"+obj.name);
        obj.address=b;
        System.out.println("the address you entered is:"+obj.address);
        obj.age=c;
        System.out.println("the age you entered is:"+obj.age);
        obj.phNo=d;
        System.out.println("the phNo you entered is:"+obj.phNo);

    }
}
class Class4{
    String name;
    String address;
    int age;
    int phNo;
}