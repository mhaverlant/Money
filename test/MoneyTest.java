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
        Expression result= five.plus(five);
        Sum sum =(Sum) result;
        Bank bank = new Bank();
        Assert.assertEquals(five,sum.augend);
        Assert.assertEquals(five,sum.addend);
    }

    @Test

    public void testReduceMoney(){
        Bank bank =new Bank();
        Money result =bank.reduce(Money.dollar(1),"USD");
        Assert.assertEquals(Money.dollar(1),result);
    }

    @Test

    public void testReduceSum(){
        Expression sum =new Sum(Money.dollar(3),Money.dollar(4));
        Bank bank = new Bank();
        Money result=bank.reduce(sum,"USD");
        Assert.assertEquals(Money.dollar(7),result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency(){
        Bank bank =new Bank();
        bank.addRate("CHF","USD",2);
        Money result = bank.reduce(Money.franc(2),"USD");
        Assert.assertEquals(Money.dollar(1),result);

    }

    @Test
    public void testIndentityRate(){
        Assert.assertEquals(1,new Bank().rate("USD","USD"));
    }

    @Test
    public void testMixedAddition(){
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank=new Bank();
        bank.addRate("CHF","USD",2);
        Money result= bank.reduce(fiveBucks.plus(tenFrancs),"USD");
        Assert.assertEquals(Money.dollar(10),result);
    }
}