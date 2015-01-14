import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testEquality(){
        Franc five=new Franc();
        Franc vrai= new Franc();
        Franc faux =new Franc();
        five.setValue(5);
        vrai.setValue(5);
        faux.setValue(6);
        assertTrue(five.equals(vrai));
        assertFalse(five.equals(faux));

    }
}