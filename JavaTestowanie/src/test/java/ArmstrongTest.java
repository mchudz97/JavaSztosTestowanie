import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class ArmstrongTest {

    Armstrong temp;

    @Before
    public void setup(){
        temp = new Armstrong();
    }

    @Test(expected = IllegalArgumentException.class)
    public void armstrongWrongInputTest1(){
        assertEquals(false, temp.isArmstrong("XD"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void armstrongWrongInputTest2(){
        assertEquals(false, temp.isArmstrong("1XD1"));
    }

    @Test
    public void armstrongCorrectInputUnmatchingNumber1(){
        assertFalse(temp.isArmstrong("21"));
    }

    @Test
    public void armstrongCorrectInputUnmatchingNumber2(){
        assertFalse(temp.isArmstrong("-21"));
    }



    @Test
    public void armstrongCorrectInputMatchingNumber1(){
        assertTrue(temp.isArmstrong("9"));
    }

    @Test
    public void armstrongCorrectInputMatchingNumber2(){
        assertTrue(temp.isArmstrong("153"));
    }

    @After
    public void teardown(){
        temp = null;
    }


}
