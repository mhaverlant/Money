import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testEquality(){
        Dollar five=new Dollar();
        Dollar vrai= new Dollar();
        Dollar faux =new Dollar();
        five.setValue(5);
        vrai.setValue(5);
        faux.setValue(6);
        assertTrue(five.equals(vrai));
        assertFalse(five.equals(faux));

    }
}