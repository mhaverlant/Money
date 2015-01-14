/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Dollar {
    private int value;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }

    public void times(int multiplier){ this.value = this.value *multiplier;}

}
