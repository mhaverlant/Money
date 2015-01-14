import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FrancTest {

    @Test
    public void testMultiplication(){
        Franc five= new Franc();
        five.setValue(5);

        Franc test = new Franc();
        test.setValue(10);
        assertEquals(test, five.times(2));

        Franc foistrois=new Franc();
        foistrois.setValue(15);
        assertEquals(foistrois, five.times(3));
    }
}