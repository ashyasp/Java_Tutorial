public class Loops {
    public static void main(String[] args) {

                // Video  4 LOOPS
        System.out.println("Testing booleans: ");
        boolean loop=true;
        boolean loop2=27>30;
        System.out.println(loop);
        System.out.println(loop2);
        System.out.println("----------");
        int value =0;
        while (value < 10){
            System.out.println("Heyy " +value);
            value=value +1;
        }
        System.out.println("-------");
        //Video 5 ( For Loops)
        for (int i =1;i<6; i++) {
            System.out.printf("Hola value is: %d" , i);
            // %d gets replaced with the value of, but only in printf not println
        }
        System.out.println();
        System.out.println("-------");

        //Video 6 ( IF-STATEMENT)
        int cond=27;
        System.out.println(cond );
        if (cond<12){
            System.out.println("Yes it is true ");
        }
        else if (cond <20){
            System.out.println("No it is false");
        }else {
            System.out.println("None of the above");
        }

        System.out.println("-------");
        int condition=10;
while (true){
    //loops and increments till it is equal to 27 then it breaks and does not increment
    System.out.println("Looping" +condition);
    if (condition==27){
        break;
    }
    condition++;
    System.out.println("gotta blast");
}

    }
}
