import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PointTest {

    Point p1;
    Point p2;

    @Before
    public void setup(){

        p1 = new Point(1,1);
        p2 = new Point(10, 1);

    }

    @Test
    public void testShow(){

        assertEquals(p1, p1.show());

    }

    @Test
    public void testTranslate1(){

        assertEquals(new Point(2,2), p1.translate(1, 1));

    }

    @Test
    public void testTranslate2(){

        assertEquals(new Point(-5,-3), p1.translate(-6, -4));

    }

    @Test
    public void testScale1(){
        assertEquals(new Point( 50,5), p2.scale(5));
    }
    @Test
    public void testScale2(){
        assertEquals(new Point(-5.5, -5.5), p1.scale(-5.5));
    }

    @After
    public void turnOff(){
        p1 = null;
        p2 = null;
    }

}
