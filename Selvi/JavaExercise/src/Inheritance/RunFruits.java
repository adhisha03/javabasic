package Inheritance;

public class RunFruits {
    public static void main(String[] args) {
        Grapes r=new Grapes("Apple","red","Grapes","violet");

        System.out.println(r.getName1());
        System.out.println(r.getColour1());
        System.out.println(r.getName());
        System.out.println(r.getColour());
        r.apple();
        r.printFruit();


    }
}
