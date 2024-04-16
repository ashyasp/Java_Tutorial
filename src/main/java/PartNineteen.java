class Thing{
    public String name;
    public final static int LUCKY_NUMBER=2;

    //static variables belong to the class there is only one copy unlike name
    public static String description;
    public static int count=0;
    Thing (){
        count++;
    }
}
public class PartNineteen {
    public static void main(String[] args) {
        System.out.println("count is: "+Thing.count);
        Thing thing1=new Thing();
        Thing thing2=new Thing();
        thing1.name="Tia";
        thing2.name="Tamera";
        System.out.println(thing1.name+" and "+thing2.name);
        System.out.println("count is now: "+Thing.count);
        Thing.description="We are twins";
        System.out.println(Thing.description);
        System.out.println("our lucky number is "+Thing.LUCKY_NUMBER);

    }
}
