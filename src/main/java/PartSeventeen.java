class Dog{
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    //Another way
    public void setInfo(String name,int age){
        setName(name);
        setAge(age);
    }
}
public class PartSeventeen {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        //using instance variable
        //dog1.name="Kyro";
        //dog1.age=3;
        //using a method
        dog1.setAge(4);
        dog1.setName("dj");
        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());


    }
}
