import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DollarTest {

    @Test
    public void testMultiplication(){
        Dollar five= new Dollar(5,"USD");


        Dollar test = new Dollar(10,"USD");

        assertEquals(test, five.times(2));

        Dollar foistrois=new Dollar(15,"USD");

        assertEquals(foistrois, five.times(3));
    }

}