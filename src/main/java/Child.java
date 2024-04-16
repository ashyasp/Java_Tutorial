public class Child implements Info {
    private String gender;

    public Child (String gender){
        this.gender=gender;
    }
    public void inherit() {
        System.out.println("I got something for my parent");
    }

    @Override
    public void showInfo() {
        System.out.println("I am a: "+ gender);
    }
}
