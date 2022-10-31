package HW150;

public class Prime {
    public static void main(String[] args) {
        int count;
        System.out.println("the hundred prime numbers:");

        for (int j=2;j<=100;j++){
            count=0;

            for(int i=1;i<=j;i++) {
                if (j % i == 0) {
                    count++;
                }
            }

            if(count==2){
                System.out.println(j+" ");
            }

        }

    }
}
