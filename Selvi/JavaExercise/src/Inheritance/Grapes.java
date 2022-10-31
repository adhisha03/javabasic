package Inheritance;
 public  class Grapes extends Fruits {
     private String name1;
     private String colour1;

     Grapes(String name1,String colour1,String name,String colour){
         super(name,colour);
         this.name1=name1;
         this.colour1=colour1;
 }
     public String getName1() {
         return name1;
     }
     public void setName1(String name1) {
         this.name1 = name1;
     }

     public String getColour1() {
         return colour1;
     }

     public void setColour1(String colour1) {
         this.colour1 = colour1;
     }
     public void printFruit() {
         System.out.println("i like this fruit");
 }
 }
