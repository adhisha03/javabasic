package HwExercise.ClassExercise;

public class CollegeEx2 {
    public static void main(String[] args) {
        College2 college2=new College2("MCC","papanadu",987968982,13);

        System.out.println(college2.getName());
        System.out.println(college2.getAddress());
        System.out.println(college2.getPhnNo());
        System.out.println(college2.getBusNo());

        college2.setName("bdu");
        System.out.println(college2.getName());
        college2.setAddress("OrathaNadu");
        System.out.println(college2.getAddress());
        college2.setPhnNo(95975423);
        System.out.println(college2.getPhnNo());
        college2.setBusNo(42);
        System.out.println(college2.getBusNo());


    }
}
