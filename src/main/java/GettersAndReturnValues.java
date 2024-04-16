class PartyPeople{
    //Video 15
    String name;
    int yearOfBirth;
    int calculateAge (){
        int age= 2024-yearOfBirth;
        if (age<21){
            System.out.println("too young to party");
        }
        else {
            System.out.println("Come party!" + "You are "+ age);
        }
        return age;
    }
    //getter
    int getYearOfBirth(){
        return yearOfBirth;
    }
}
public class GettersAndReturnValues {
    public static void main(String[] args) {
        PartyPeople person1=new PartyPeople();
        person1.name="Ashya";
        person1.yearOfBirth =2002;
        person1.calculateAge() ;
        //Another way instead of coding within the method
        PartyPeople person2=new PartyPeople();
        person2.name="Mercedes";
        person2.yearOfBirth=1982;
        int years= person2.calculateAge() ;
        System.out.println("Your age is "+ years);
        //using a getter
        int year= person2.getYearOfBirth();
        System.out.println("The year you were born is: "+year);
    }
}
