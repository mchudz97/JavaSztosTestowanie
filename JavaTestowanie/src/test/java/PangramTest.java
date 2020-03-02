import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.*;
public class PangramTest {


    Pangram temp;
    boolean[] bool;

    @Before
    public void setup(){

        temp = new Pangram();

    }

    @Test(expected = IllegalArgumentException.class)
    public void nullStringValueException(){

        assertEquals(false, temp.isPangram(null));

    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyStringException(){

        assertEquals(false, temp.isPangram(""));

    }

    @Test
    public void whenNotPangram(){

        assertEquals(false, temp.isPangram("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));

    }

    @Test
    public void whenIsPangram(){

        assertEquals(true, temp.isPangram("The quick brown fox jumps over the lazy dog"));

    }

    @Test
    public void incorrectArrayString(){

        bool = new boolean[]{
                false, false, false, false
        };

        assertArrayEquals(bool, temp.arePangrams(new String[]{"XD", "aeewafwfweqfqqwfeqefqwq",
        "21344132134213241324", "qwertyuiopasdfghjklzxcvbn"}));

    }

    @Test
    public void correctArrayString(){

        bool = new boolean[]{
                true, true, true
        };

        assertArrayEquals(bool, temp.arePangrams(new String[]{
                "The quick brown fox jumps over the lazy dog",
                "qwertyuiopasdfghjklzxcvbnm", "QwErTyUiOpAsDfGhJkLzXcVbNm"}));

    }

    @Test
    public void mixedArrayString(){

        bool = new boolean[]{
                true, false, true
        };

        assertArrayEquals(bool, temp.arePangrams(new String[]{
                "The quick brown fox jumps over the lazy dog", "to nie zadziala",
                "qwertyuiopasdfghjklzxcvbnm"
        }));


    }

    @Test(expected = IllegalArgumentException.class)
    public void mixedArrayWithException(){
        bool = new boolean[]{
                true, false, false
        };

        assertArrayEquals(bool, temp.arePangrams(new String[]{
                "The quick brown fox jumps over the lazy dog", "to nie zadziala",
                ""
        }));

    }

}
