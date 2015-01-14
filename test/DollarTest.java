import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DollarTest {

    @Test
    public void testMultiplication(){
        Dollar five= new Dollar();
        five.setValue(5);

        Dollar test = new Dollar();
        test.setValue(10);
        assertEquals(test, five.times(2));

        Dollar foistrois=new Dollar();
        foistrois.setValue(15);
        assertEquals(foistrois, five.times(3));
    }

}