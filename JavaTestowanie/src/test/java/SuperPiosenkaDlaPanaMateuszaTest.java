import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SuperPiosenkaDlaPanaMateuszaTest {

    SuperPiosenkaDLaPanaMateusza temp;
    @Before
    public void setup() {
        temp = new SuperPiosenkaDlaPanaMateusza();
    }

    @Test(expected = IllegalArgumentException.class)
    public void kiedyWersPozaPrzedzialem(){
        assertEquals("", temp.getSingeVerse(10000));
    }

    



}
