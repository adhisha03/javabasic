package Loop150;

public class ArmstrongNum {
    public static void main(String[] args) {
        int digit1;
        int digit2;
        int digit3;

        for (int num=1;num<=1000;num++){

            int temp=num;
            digit1=temp%10;

            temp=temp/10;
            digit2=temp%10;

            temp=temp/10;
            digit3=temp%10;

       if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3==num){

        System.out.println(num);
    }
    }
}
}
