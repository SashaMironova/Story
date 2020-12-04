import java.util.ArrayList;
import java.util.Random;

public class House {
//    ArrayList<Window> windows = new ArrayList<>();
    Random random = new Random();
    int numberOfFloors = random.nextInt(3)+2;
    ArrayList<Floor> floors = new ArrayList<>();
    House() {
        for (int i = 1; i <= numberOfFloors; i++) {
            floors.add(new Floor(i));
        }
    }
    Platform platform = new Platform();
}
