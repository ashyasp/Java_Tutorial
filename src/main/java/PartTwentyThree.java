public class PartTwentyThree {
    public static void main(String[] args) {

Parent parent1=new Parent();
parent1.brownEyes();

Child child1=new Child("Female");
child1.inherit();

Info info1=new Parent();
info1.showInfo();

Info info2= child1;
info2.showInfo();

    }
}
