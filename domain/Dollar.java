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

    public Dollar times(int multiplier){
        Dollar multi=new Dollar ();
        multi.setValue(this.value*multiplier);
        return multi;
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar)object;
        return this.value == dollar.getValue();
    }

}
