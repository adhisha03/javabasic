package HW150;
import java.util.Calendar;
public class CurrentDataTimeFormat {
    public static void main(String[] args) {
        Calendar ca1=Calendar.getInstance();
        System.out.println("current date and time:");

        System.out.format("%tB%te, %tY%n",ca1,ca1,ca1);
        System.out.format("%t1:%tM%tp%n",ca1,ca1,ca1);


    }
}
