class Toy{
    private String name;
    private int serial;
    //Constructor is a special method which is run every time you create an instance of the class
    //usually a method is lowercase first but because it has to have the same name of the class it is Uppercase
    //constructor is run everytime a new instance is created
    public Toy(){
        //calling constructor 1
        System.out.println("buy me for your kids!");
        name="American Doll";
    }
    public Toy (String name){
        //Calling constructor 2
        System.out.println("No buy me for your kids");
        this.name=name;
    }
    public Toy (String name,int serial){
        //calling constructor 3
        System.out.println("Your kids will love me as their new toy");
        this.name=name;
        this.serial=serial;
    }
}
public class PartEighteen {
    public static void main(String[] args) {
Toy doll=new Toy();
Toy doll2=new Toy("suzy");
Toy doll3=new Toy("Andy",300);
    }
}
