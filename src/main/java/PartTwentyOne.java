class Pets{
    private int ID;
    private String name;
    public Pets (int ID,String name){
        this.ID=ID;
        this.name=name;
    }
    //to string method
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(ID).append(": ").append(name);
        return sb.toString();
        //or print format with left allign
        // return String.format("%-4d:%s",ID,name);

    }
}


public class PartTwentyOne {
    public static void main(String[] args) {
        Pets pet = new Pets(21,"KJ");
        System.out.println(pet);
    }
}
