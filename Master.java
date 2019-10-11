

//this is the subclass or child class that inherit the properties of the Employee class(parent class or super class)
public class Master extends Employee{
    private Rank rank = PRO;
    //fufil the Employee constructor 
    public Master(String name, int age){
        super(name,age);
        //this.rank = rank;
    }
    //override the method in the parent class 
    @Override
    public String getName(){
        return super.getName()+"Overrided";
    }
    //declare the enum 
    public enum Rank{
        NOOB,
        PRO
    }
    //use the enum
    public String getRank(){
        switch(this.rank){
            case NOOB:return "noob";
            default:return "pro";
        }
    }
}