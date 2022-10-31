public class ReturnSub {
    static int myMethod(int x, int y, int z){
        return x-y-z;
    }
    public static void main(String[] args){
        int c=myMethod(10,5,3);
        System.out.println(c);
    }

}
