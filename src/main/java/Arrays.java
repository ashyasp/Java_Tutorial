public class Arrays {
    public static void main(String[] args) {
        //Video 10
                int[] values; //only a reference not a bucket
                //allowing to  hold 3 integers
                values=new int[3];
        System.out.println("default number of an array: "+values[0]);

        values[0]=20;
        values[1]=30;
        values[2]=40;
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        //loop throught to print all values out
        for (int i=0; i <values.length;i++){
            System.out.println(values[i]);
        }
        //another way to initiate an array
        int [] numbers={2,4,6};
        for (int i =0; i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
        //Video 11 (Array of Strings)
        String[]  words =new String[3];
        words[0]="Good";
        words[1]="Afternoon";
        words[2]="You";
        for(String wordss:words){
            System.out.println(wordss);
        }
        //Video  12 (dimmesional arrays)
        int [] [] table={
                {0,1,2,4},
                {24,23,32,6},
                {2,4,6,8}
        };
        //getting certain idex of 2 dimmensional arrays
        System.out.println(table[0][2]);
        System.out.println(table[1][3]);
        System.out.println("Looping through 2 dimensional arrays:");
        for (int row=0;row< table[row].length;row++){
            for (int col=0; col<table[row].length;col++){
                System.out.print(table[row][col]+"\t");
            }
            System.out.println();
        }


    }
}
