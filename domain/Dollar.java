/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Dollar extends Money{


    public Dollar times(int multiplier){
        Dollar multi=new Dollar ();
        multi.setValue(value*multiplier);
        return multi;
    }

}
