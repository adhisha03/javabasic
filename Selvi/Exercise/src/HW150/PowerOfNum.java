package HW150;

public class PowerOfNum {
    public static void main(String[] args) {

        int base=5;
        int exponent=2;
        int result=1;

        while (exponent!=0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer="+result);
        }
    }

