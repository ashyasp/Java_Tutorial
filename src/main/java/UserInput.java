import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
                       //Video 7

        //creating a new object and passing it in the standard predefined scanner.in object
        Scanner input =new Scanner(System.in);
        //output prompt
        System.out.println("Enter your birth month");
        //wait for the user to enter the month
        String line=input.nextLine();
        //Reiterate back what they entered
        System.out.println("Your birth month is the : " + line);
        //create output
        System.out.println("Enter your birth date");
        //get input from user
        int date=input.nextInt();
        //Reiterate
        System.out.println("Your birth date is "+ date);
        System.out.println("What is your birth year?");
        int year =input.nextInt();
        System.out.println("Your birthday is: "+line+" the "    +date+ ", "  +year);

    }
}
