package MapExercise;

public class DetailsHM{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        DetailsHM obj=(DetailsHM) o;
        return obj.getName().equals(this.name)&& obj.getAge()==this.getAge();
    }

    @Override
    public int hashCode() {
       return 50;
    }

    public DetailsHM(String name, int age) {
        this.name = name;
        this.age=age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}











