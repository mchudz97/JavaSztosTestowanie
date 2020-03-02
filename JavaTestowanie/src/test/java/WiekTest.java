import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class WiekTest {



    Wiek temp;
    double delta1;
    double delta2;
    @Before
    public void setup(){
        temp = new Wiek();
        delta1 = 0.005;
        delta2 = 0.00001;
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeSecondNumber(){
        assertEquals(1, temp.planetarAge("Ziemia", -2000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidPlanetName(){
        assertEquals(1, temp.planetarAge("ziemniak", 1111111));
    }

    @Test()
    public void validAge1(){
        assertEquals(31.69, temp.planetarAge("Ziemia",1000000000), delta1);
    }

    @Test()
    public void validAge2(){
        assertEquals(280.88, temp.planetarAge("Merkury",2134835688), delta1);
    }

    @Test
    public void withoutDelta(){
        assertNotEquals(280.88, temp.planetarAge("Merkury",2134835688));
    }

    @Test
    public void BadPrecised1(){
        assertNotEquals(31.69, temp.planetarAge("Ziemia",1000000000), delta2);
    }

    @Test
    public void BadPrecised2(){
        assertNotEquals(280.88, temp.planetarAge("Merkury",2134835688), delta2);

    }

}
