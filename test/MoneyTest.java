import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testEquality(){
        Dollar five= new Dollar();
        five.setValue(5);
        Franc fivef=new Franc();
        Franc vraif= new Franc();
        Franc fauxf =new Franc();
        fivef.setValue(5);
        vraif.setValue(5);
        fauxf.setValue(6);
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse((Money.dollar(5)).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }

    @Test
    public void testDollarMultiplication(){
        Money five= Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testMultiplicationFranc(){
        Money five= Money.franc(5);

        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}