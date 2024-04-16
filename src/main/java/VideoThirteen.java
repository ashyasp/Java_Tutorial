class Person{
    //Instance variables (data or "state")
    String name;
    int luckyNum;

    //Video 14
    void sing () {
        System.out.println("I am singingggggg ");
        System.out.println( "My name is : "+name+ " my lucky number is: "+luckyNum);
    }
    void askMe (){
        for (int i =0;i<3;i++){
            System.out.println("What is your lucky number?");
        }
    }
}
//classes can contain
//1.Data(instance variables)
//2.Subroutines (methods)

public class VideoThirteen {

    public static void main(String[] args) {
Person person1=new Person();
person1.name="Joe West";
person1.luckyNum=7;

Person person2=new Person();
person2.name="Adam Sandler";
person2.luckyNum=4;

        //Video 14
        person2.sing();
        person1.sing();
        person1.askMe();
        }
    }

