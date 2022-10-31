package HW150;

public class BattingAverage {
    public static void main(String[] args) {
        int Totalmatches=100;
        int totalruns=4000;
        int innings=1;
        int notout=1;
        double average;
        average=totalruns/(innings-notout);

        System.out.println("batting average="+average);

    }
}
