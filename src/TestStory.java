import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class TestStory {

    Crowd crowd = new Crowd();
    Human human1 = new Human(true, "Arthur");
    Human human2 = new Human(true, "speaker");
    House house = new House();
    Window window = new Window(2);

    @Before
    public void setup(){
        house.floors.get(1).windows.add(window);
        human1.slide(window, Surface.AIR);
        house.platform = new Platform();
        human2.talkTo(crowd);
    }

    @Test
    public void correctWindow(){
        Assert.assertEquals(2, window.floor);
    }

    @Test
    public void windowsExisе(){
        Assert.assertNotNull(house.floors.get(1).windows);
    }

    @Test
    public void platformExists(){
        Assert.assertNotNull(house.platform);
    }

    @Test
    public void correctNumberOfFloors(){
        Assert.assertTrue(house.floors.size() > 1);
    }

    @Test
    public void correctSurface(){
        Assert.assertTrue(human1.surface == Surface.AIR);
    }

    @Test
    public void houseHasPlatform(){
        Assert.assertNotNull(house.platform);
    }

    @Test
    public void speakerExists(){
        Assert.assertNotNull(human2);
    }
}
