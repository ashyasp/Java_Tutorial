class Robot {
    public void speak(String speech){
        System.out.println(speech);
    }
    public void jump(int height){
        System.out.println("I can jump "+height+"ft");
    }

}
public class PartSixteen{
    public static void main(String[] args) {
        Robot AI= new Robot();
        AI.speak("BeepBoop, I am AI");
        AI.jump(25);

    }
}
