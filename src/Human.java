import java.util.Dictionary;

public class Human {

    boolean sex;
    String name;
    Surface surface;

    public Human(boolean sex, String name){
        this.sex = sex;
        this.name = name;
    }

    public void slide(Window window, Surface surface){
        this.surface = surface;
        System.out.println(this.name + " скользит к " + window.getClass() + window.floor + " по " + surface);
    }

    public void talkTo(Crowd crowd){
        System.out.println(this.name + " обращается к " + crowd.getClass());
    }
}
