public class Parent implements Info {
    private int age;
    public void brownEyes(){
        System.out.println("I have brown eyes");
    }
    public void greenEyes (){
        System.out.println("I have green eyes");
    }

    @Override
    public void showInfo() {
        System.out.println("I am a parent, age: "+ age);
    }
}
