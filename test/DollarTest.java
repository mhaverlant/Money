import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class DollarTest {

    @Test
    public void testMultiplication(){
        Dollar five= new Dollar();
        five.setValue(5);
        Dollar product= five.times(2);
        assertEquals(10,product.getValue());
        product=five.times(3);
        assertEquals(15, product.getValue());
    }
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