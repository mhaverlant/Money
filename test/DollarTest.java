import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DollarTest {

    @Test
    public void testMultiplication(){
        Dollar five= new Dollar();
        five.setValue(5);
        five.times(2);
        assertEquals(10,five.getValue());
    }
}