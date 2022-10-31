package HW150;

public class DistanceBetWePoint {
    public static void main(String[] args) {
        int x1,x2;
        int y1,y2;
        double Distance;
        x1=2;x2=4;
        y1=2;y2=4;
        Distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+Distance);



    }
}
