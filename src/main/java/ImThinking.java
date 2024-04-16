import java.util.Scanner;

public class ImThinking {
    public static void main(String[] args) {
        //Video 8

        Scanner scanner=new Scanner(System.in);
        /*
        System.out.println("I'm thinking of a number,what is it?");
        int value=scanner.nextInt();

        while (value != 27){
            System.out.println("Keep guessing");
            value =scanner.nextInt();
        }
         */
        int value=0;
        do {
            System.out.println("I'm thinking of a number,what is it?");
            value=scanner.nextInt();
        } while (value != 5);
        System.out.println("you guessed correct!");

    }
}
