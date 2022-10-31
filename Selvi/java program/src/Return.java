public class Return {

    static int addition(int x, int y, int z) {
        return x + y + z;

    }
    static int subtraction(int a,int b,int c){
        return a-b-c;
    }
    static int multiplication(int d,int e,int f){
        return d*e*f;
    }
    static int division(int g, int h, int i){
        return g/h/i;
    }
    static int modulus(int j, int k, int l){
        return j%k%l;
    }


public static void main(String[] args) {

    System.out.println(addition(76,87,509));
    System.out.println(subtraction(87,24,89));
    System.out.println(multiplication(13,15,16));
    System.out.println(division(100,4,2));
    System.out.println(modulus(75,50,25));
}


}

