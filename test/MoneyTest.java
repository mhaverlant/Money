import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class MoneyTest {


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

    @Test

    public void testCurrency(){
        Assert.assertEquals("USD",Money.dollar(1).currency);
        Assert.assertEquals("CHF",Money.franc(1).currency);
    }

    @Test

    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(6).equals(Money.dollar(5)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testSimpleAddition(){
        Money five= Money.dollar(5);
        Expression sum= five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum,"USD");
        Assert.assertEquals(Money.dollar(10),reduced);
    }
}