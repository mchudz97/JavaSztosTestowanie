import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SuperPiosenkaDlaPanaMateuszaTest {

    SuperPiosenkaDLaPanaMateusza temp;
    String piosenka;

    @Before
    public void setup() {
        temp = new SuperPiosenkaDlaPanaMateusza();
        piosenka = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                "\n" +
                "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
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

    @Test
    public void sectionWithFullSong(){
        assertEquals(piosenka, temp.getSection(0,11));
    }
    @Test
    public void fullSong(){
        assertEquals(piosenka, temp.getFullSong);
    }

}
