public class TypeOfCar extends Car {
    protected String nameOf;
    protected char model;
public void heated(){
    System.out.println("I have heated seats");
}
    public TypeOfCar(String nameOf, char model) {
      this.model=model;
      this.nameOf=nameOf;
        System.out.println("I am : "+ nameOf+"Type: "+model);
    }
}
