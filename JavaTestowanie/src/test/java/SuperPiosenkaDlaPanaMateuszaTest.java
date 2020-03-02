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
    @Test
    public void singleVerse1(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
                temp.getSingleVerse(0));
    }

    @Test
    public void singleVerse2(){
        assertEquals("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
                temp.getSingleVerse(11));
    }

    @Test
    public void sectionWithTwoVerses(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
                temp.getSection(0,1));
    }


}
