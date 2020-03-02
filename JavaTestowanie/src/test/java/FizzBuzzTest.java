import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    FizzBuzz temp;

    @Before
    public void setUp(){
        temp = new FizzBuzz();
    }

    @Test
    public void trivialTest() {
        assertTrue(true);
    }

    @Test
    public void test_fizz_method(){
        assertEquals("Fizz",temp.print(3));
        assertEquals("Fizz",temp.print(9));
    }

    @Test
    public void test_buzz_method(){
        assertEquals("Buzz",temp.print(5));
        assertEquals("Buzz",temp.print(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_exception_fizz_buzz(){
        assertEquals("FizzBuzz", temp.print(-15));
    }

    @Test
    public void test_fizz_buzz_method(){
        assertEquals("FizzBuzz", temp.print(15));
    }
    @Test
    public void test_int_to_string(){
        assertEquals("77", temp.print(77));
        assertEquals("997", temp.print(997));
    }

    @After
    public void teardown(){
        temp = null;
    }

}