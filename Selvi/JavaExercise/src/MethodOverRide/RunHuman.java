package MethodOverRide;

public class RunHuman extends Human {

    public void details(){
        System.out.println("selvi is so cute");

        }

    public static void main(String[] args) {
        RunHuman runHuman=new RunHuman();
        runHuman.details();
//        Human human=new Human();
//        human.details();
    }
    }

