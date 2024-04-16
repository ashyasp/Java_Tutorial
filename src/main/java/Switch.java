import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Video 9
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter Zodiac sign,Upper case first letter please!");
        String text= input.nextLine();

//int and String are common variables used  in a switch
//if i wanted to allow both upper case and lower cause i would have to a loop not switch to immplement .equalsIgnoreCase
        switch(text){
            case "Aries":
                System.out.println("Your birthday is between March 21-April 19");
                break;
            case "Taurus":
                    System.out.println("Your birthday is between April 20-May 20");
                    break;
            case"Gemini":
                System.out.println("Your birthday is between May 21-June 20");
                break;
            case "Cancer":
                System.out.println("Your birthday is between June 21-July 22");
                break;
            case "Leo":
                System.out.println("Your birthday is between July 23-August 22");
                        break;
            case "Virgo":
                System.out.println("Your birthday is between August 23-September 22");
                break;
            case "Libra":
                System.out.println("Your birthday is between September 23-October 22");
                break;
            case "Scorpio":
                System.out.println("Your birthday is between October 23-November 21");
                break;
            case "Sagittarius":
                System.out.println("Your birthday is between November 22-December 21");
                break;
            case "Capricorn":
                System.out.println("Your birthday is between December 22-January 19");
                break;
            case "Aquarius":
                System.out.println("Your birthday is between Jan 20-Feb 18");
                break;
            case "Pisces":
                System.out.println("Your birthday is between Feb 19-March 20");
                break;

            default:
                System.out.println("Zodiac not recognized ");
        }


    }
}
