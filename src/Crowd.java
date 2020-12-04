import java.util.ArrayList;

public class Crowd {
    public Crowd(){
        ArrayList<Human> crowd= new ArrayList<Human>();
        for (int i =0; i<10; i++){
            crowd.add(new Human(true, Integer.toString(i)));
        }
    }

    public void scream(){
        ScreamCharacteristic screamCharacteristic = ScreamCharacteristic.JIBILANTLY;
        System.out.println("Толпа разразилась ликующими криками");
    }
}
