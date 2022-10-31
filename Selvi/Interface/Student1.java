package Interface;
public class Student1 implements School {
    String Name="selvi";
    float UgPercentage=95.5f;
    double PgPercentage=99.10d;
    @Override
    public void Percentage() {
        System.out.println("enter the Details :");
    }

    public String getName(String Name,String FatherName,String Qualification){
        System.out.println(" Name:"+" "+Name+"!"+" fathername:"+" "+FatherName+"! "+"qualification:"+" "+Qualification);
        return Name;
    }

    public float getUgPercentage(float a,float b,float c) {
      float d=a+b+c;
        System.out.println("enter the UgPercentage:"+d);
        return d;
    }

    public double getPgPercentage(double a,double b ) {
       double c=a*b;
        System.out.println("enter the PgPercentage:"+c);
        return c;
    }
}

