package HwExercise.ClassExercise;

public class CollegeEx1 {
    public static void main(String[] args) {
        College1 college1=new College1("STET","Mannargudi",98785643,16);
        System.out.println(college1.Name);
        System.out.println(college1.Address);
        System.out.println(college1.phnNo);
        System.out.println(college1.busNo);

        college1.Name="AVVM";
        System.out.println(college1.Name);
        college1.Address="Thanjavur";
        System.out.println(college1.Address);
        college1.phnNo=907823438;
        System.out.println(college1.phnNo);
        college1.busNo=34;
        System.out.println(college1.busNo);
    }
}
