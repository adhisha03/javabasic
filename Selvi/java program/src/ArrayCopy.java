public class ArrayCopy {
    public static void main(String[] args){
        String bike1[]={"FZ", "R15", "pulser", "KTM","RX 100"};
        String bike2[]=new String[bike1.length];
        int i;
        for(i=0;i<bike1.length;i++){
            System.out.println(" the elements of array:"+bike1[i]);

        }
        for(  i=0;i<bike1.length;i++){
            bike2[i]=bike1[i];
            System.out.println("the elements of new array:"+bike2[i]);

        }
    }
}
