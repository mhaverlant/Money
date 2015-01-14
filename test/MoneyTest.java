import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testEquality(){
        Dollar five=new Dollar();
        Dollar vrai= new Dollar();
        Dollar faux =new Dollar();
        five.setValue(5);
        vrai.setValue(5);
        faux.setValue(6);
        Franc fivef=new Franc();
        Franc vraif= new Franc();
        Franc fauxf =new Franc();
        fivef.setValue(5);
        vraif.setValue(5);
        fauxf.setValue(6);
        assertTrue(fivef.equals(vraif));
        assertFalse(fivef.equals(fauxf));
        assertTrue(five.equals(vrai));
        assertFalse(five.equals(faux));

    }
}