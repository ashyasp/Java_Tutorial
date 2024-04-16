public class PartTwenty {
    public static void main(String[] args) {
        //inefficient
        String info="";
        info+= "My name is Ashya";
        info+= "";
        info+= "i have a coding headache";
        System.out.println(info);

        // same thing but more efficient, stringbuilder gives you a more memorry efficient way of appending text

        StringBuilder sb=new StringBuilder("");
        sb.append("My name is Ashya");
        sb.append(" ");
        sb.append("I have a coding headache!");
        System.out.println(sb.toString());
//Method chaining
        StringBuilder s = new StringBuilder();
        s.append("My name is Ashya Spencer.")
        .append(" ")
        .append("The screen is hurting my brain");
        System.out.println(s.toString());
    }
}
