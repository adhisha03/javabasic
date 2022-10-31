public class AsDs {
    public static void main(String[] args){
        int[] numbers=new int[] {44,67,54,99,77};
        int value;
        for(int i=0; i<numbers.length; i++){
            for(int j=i;j<numbers.length; j++){
                if(numbers[i]>numbers[j]){
                    value=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=value;
                }

            }
        }
        for(int a:numbers){
            System.out.println("the ascending number is:"+a);
        }
    }
}
