/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Franc extends Money{

    public Franc times(int multiplier){
        Franc multi=new Franc ();
        multi.setValue(this.value*multiplier);
        return multi;
    }
}
