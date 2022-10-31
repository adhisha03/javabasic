package HW150;

public class AverageMark {
    public static void main(String[] args) {
        int i=0,n=3,average=0;
        int arr[]=new int[n];

        arr[0]=79;
        arr[1]=98;
        arr[2]=54;

        for (i=0;i<n;i++) {

            average = average + arr[i];
        }
            System.out.println("average of"+"("+ arr[0]+" , "+arr[1]+" , "+arr[2]+")is="+average/n);


    }
}
