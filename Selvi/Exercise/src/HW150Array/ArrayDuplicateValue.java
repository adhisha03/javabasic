package HW150Array;

public class ArrayDuplicateValue {
    public static void main(String[] args) {
        int number[]={1,2,3,4,2,3,5,6,7,8};

        for (int i=0;i< number.length-1;i++){

            for (int j=i+1;j< number.length;j++){
                if(number[i]==number[j] && i!=j){
                    System.out.println("duplicate array:"+number[i]);
                }

            }

        }
    }
}
