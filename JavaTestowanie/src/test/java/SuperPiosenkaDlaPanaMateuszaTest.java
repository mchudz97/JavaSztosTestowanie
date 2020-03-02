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
    public void whenVerseOutOfRange(){
        assertEquals("", temp.getSingeVerse(10000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSectionOutOfRange(){
        assertEquals("", temp.getSection(0, 10000));

    }
    





}
