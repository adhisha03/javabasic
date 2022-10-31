package Method150;

public class Factorial {
    public static void main(String args[]){
        int fact=1;
        int number=5;
        fact = factorialofnumber(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
    static int factorialofnumber(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorialofnumber(n-1));
    }
}

