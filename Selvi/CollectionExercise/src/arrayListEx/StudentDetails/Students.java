package arrayListEx.StudentDetails;

import java.util.ArrayList;

public class Students {
    private String name;
    private String id;
    private String gender;
    private boolean isHostel;
    private String city;
    private int age;
    private boolean wearSpecs;
    private int mobileNO;
    private int standard;

    public Students(String name, String id, String gender, boolean isHostel, String city, int age, boolean wearSpecs, int mobileNO, int standard) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.isHostel = isHostel;
        this.city = city;
        this.age = age;
        this.wearSpecs = wearSpecs;
        this.mobileNO = mobileNO;
        this.standard = standard;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHostel() {
        return isHostel;
    }

    public void setHostel(boolean hostel) {
        isHostel = hostel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWearSpecs() {
        return wearSpecs;
    }

    public void setWearSpecs(boolean wearSpecs) {
        this.wearSpecs = wearSpecs;
    }

    public int getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(int mobileNO) {
        this.mobileNO = mobileNO;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
    public static int getByStandardCount(ArrayList<Students> students, int standard) {
       int count=0;
        int sum = 0;
        for (Students s1 : students) {
            if (s1.getStandard() == standard) {
                count++;

            }
        }
        return count;
    }
    public static int GenderCount(ArrayList<Students>students,String gender){
        int count=0;
        int sum=0;
        for (Students s2:students){
            if(s2.getGender()==gender) {
                count++;
            }
            }
        return count;

        }
        public static int StandGenderCount(ArrayList<Students>students,int standard,String gender){
        int count=0;
        for (Students s3:students){
            if( s3.getStandard()==standard ) {
                count++;
            }
        }
        return  count;
        }
        public static int Totalage(ArrayList<Students>students,int standard) {

            int sum = 0;
            for (Students s4 : students) {
                if (s4.getStandard() == standard) {
                    sum += s4.getAge();
                }
            }
            return sum;
        }
        public static int StudentAgeCount(ArrayList<Students>students,int age){
        int count=0;
            for (Students s5:students){
                if (s5.getAge()==age){
                    count++;
                }
            }
            return count;
        }
        public static int PrintNameCount(ArrayList<Students>students, int standard, String name){
        int count=0;
            for (Students s6:students){
                if(s6.getStandard()==standard && s6.getName()==name){
                    count++;
                }
            }
            return count;
        }
        public static  String printName(ArrayList<Students>students) {
        String Name="";
        for (Students s6 : students) {
            if (s6.getName().startsWith("s")) {
                System.out.println(s6.getName());
            }
        }
            return Name ;
        }

    public static boolean WearSpecs(ArrayList<Students>students) {
        String Name = " ";
        for (Students s7 : students) {
            if (s7.isWearSpecs() ==true) {
                Name = s7.getName();
                System.out.print(Name+" , ");
            }
        }
        return true;
        }
}







