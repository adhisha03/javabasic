package HwExercise.ClassExercise;

public class College2 {
    private String name;
    private String address;
    private int phnNo;
    private int busNo;


    College2(String Name1,String Address2,int phnNo2,int busNo2){
        this.name=Name1;
        this.address=Address2;
        this.phnNo=phnNo2;
        this.busNo=busNo2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(int phnNo) {
        this.phnNo = phnNo;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
}
