import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FrancTest {

    @Test
    public void testMultiplication(){
        Franc five= new Franc(5,"CHF");


        Franc test = new Franc(10,"CHF");

        assertEquals(test, five.times(2));

        Franc foistrois=new Franc(15,"CHF");

        assertEquals(foistrois, five.times(3));
    }
}