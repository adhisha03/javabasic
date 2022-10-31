package HW150;

public class SwapVariable {
    public static void main(String[] args) {
        int day1,day2,x;
        day1=23;
        day2=24;
        System.out.println("before swap="+" "+day1+" "+day2);
        x=day2;
        day2=day1;
        day1=x;
        System.out.println("after swap="+" "+day1+" "+day2);

    }
    }