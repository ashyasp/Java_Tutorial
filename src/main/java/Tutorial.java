public class Tutorial {

    public static void main(String[] args) {

        //Video 1 -2
        System.out.println("Hello this is Ashya Spencer !");
        //video 1       (8) Primative Types
        int myAge;   //my age is of type INT,declaring the variable
        myAge=21;    //initializing the variable
        short myShort=377;
        long myLong =9700;
        double myDate = 04.27;
        float myFloat = 199.99f;
        char myInitial=  'A';
        boolean isMyBdayComingUp=true;
        byte myByte=12;

        System.out.println("My age is " + myAge + " years old.My first inital is "+ myInitial+" My birthday is "+myDate+". Is my birthday in less than "+myByte +"days?");
        System.out.println(isMyBdayComingUp);
        System.out.println("A gift costs between " +myFloat+" and "+myLong);
        System.out.println("There will be "+myShort+" days till my next birthday!");

        // Video 3 Non Primative Types
String myString= "Good Evening";
String blank= " ";
String name= "Spencer";
String greeting= myString+blank+name;
        System.out.println(greeting);
        //concat strings + \" (text) \" = doubles quotes around word
        System.out.println("Hello" + " "+ "A. Spencer or \"Shya\" ");
        //New line= \n
        System.out.println("Hello\nWorld!");
        //backsapce = \b (took out o)
        System.out.println("Hello\bWorld!");
        //tab = \t (adds an extra space)
        System.out.println("Hello\tWorld!");
        //carriage return = \r (takes out Hello?)
        System.out.println("Hello\rWorld!");








    }
}
