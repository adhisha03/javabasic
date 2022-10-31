package HW150;

public class ReverseString {
    public static void main(String[] args) {
        String name="PichaiSelvi";

        String reverse=new StringBuffer(name).reverse().toString();
        System.out.println("before name="+name);
        System.out.println("after name="+reverse);
    }
}
