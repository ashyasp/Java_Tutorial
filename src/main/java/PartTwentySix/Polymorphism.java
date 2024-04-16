package PartTwentySix;

public class Polymorphism {
    public static void main(String[] args) {
        Classes class1=new Classes();
        Art abstractArt=new Art();

        Classes class2=abstractArt;

        class2.goTo();

        abstractArt.draw();

    }
}
