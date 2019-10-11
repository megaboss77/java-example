import Master.Rank;

//import java.util.Scanner
/*
compile cmd to make .class file 
javac test1.java 
run cmd 
java test1
*/
//import Employee;



public class test1{
    public static void main(String[] args){
        String[] names = new String[]{"boss","moo","max","nano"};
        //this is foreach in java
        for(String name:names){
            System.out.println(name);
            //check the object type 
            if(name instanceof String){
                System.out.println("This is String");
            }
        //casting 
        // String a = (Character)new String("1");
        // System.out.println(a);
        }
        //non static class need to be instantiate even if it is located in the same class 
        test1 t = new test1();
        Employee boss = new Employee("BOSS",24);
        Master b = new Master("MASTUR", 50);
        //t.printTest(boss.getName()+boss.getAge()+1);
        t.printTest(b.getName()+b.getAge()+b.getRank());
        

    }
    public void printTest(String a){
        System.out.println(a);
    }
}
